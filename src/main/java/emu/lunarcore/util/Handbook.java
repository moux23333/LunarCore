package emu.lunarcore.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import emu.lunarcore.GameConstants;
import emu.lunarcore.LunarCore;
import emu.lunarcore.command.Command;
import emu.lunarcore.data.GameData;
import emu.lunarcore.data.excel.*;

public class Handbook {

    public static void generate() {
        // Load text map
        Map<Long, String> textMap = null;
        List<Integer> list = null;

        try {
            textMap = JsonUtils.loadToMap(LunarCore.getConfig().getResourceDir() + "/TextMap/TextMapEN.json", Long.class, String.class);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        // Save to file
        String file = "./Lunar Core Handbook.txt";

        try (PrintWriter writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8), true)) {
            // Format date for header
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();

            // Header
            writer.println("# Lunar Core " + GameConstants.VERSION + " Handbook");
            writer.println("# Created " + dtf.format(now));
            
            // Dump commands
            writer.println(System.lineSeparator());
            writer.println("# Commands");
            list = GameData.getAvatarExcelMap().keySet().intStream().sorted().boxed().toList();
            for (var entry : LunarCore.getCommandManager().getLabels().entrySet()) {
                Command command = entry.getValue().getClass().getAnnotation(Command.class);
                if (command == null) continue;
                
                writer.println(command.desc());
            }

            // Dump avatars
            writer.println(System.lineSeparator());
            writer.println("# Avatars");
            list = GameData.getAvatarExcelMap().keySet().intStream().sorted().boxed().toList();
            for (int id : list) {
                AvatarExcel excel = GameData.getAvatarExcelMap().get(id);
                writer.print(excel.getId());
                writer.print(" : ");
                writer.println(textMap.getOrDefault(excel.getAvatarName(), "null"));
            }

            // Dump items
            writer.println(System.lineSeparator());
            writer.println("# Items");
            list = GameData.getItemExcelMap().keySet().intStream().sorted().boxed().toList();
            for (int id : list) {
                ItemExcel excel = GameData.getItemExcelMap().get(id);
                writer.print(excel.getId());
                writer.print(" : ");
                writer.println(textMap.getOrDefault(excel.getItemName(), "null"));
            }
            
            // Dump props
            writer.println(System.lineSeparator());
            writer.println("# Props (Spawnable)");
            list = GameData.getPropExcelMap().keySet().intStream().sorted().boxed().toList();
            for (int id : list) {
                PropExcel excel = GameData.getPropExcelMap().get(id);
                writer.print(excel.getId());
                writer.print(" : ");
                writer.println(textMap.getOrDefault(excel.getPropName(), "null"));
            }

            // Dump npc monsters
            writer.println(System.lineSeparator());
            writer.println("# NPC Monsters (Spawnable)");
            list = GameData.getNpcMonsterExcelMap().keySet().intStream().sorted().boxed().toList();
            for (int id : list) {
                NpcMonsterExcel excel = GameData.getNpcMonsterExcelMap().get(id);
                writer.print(excel.getId());
                writer.print(" : ");
                writer.println(textMap.getOrDefault(excel.getNPCName(), "null"));
            }

            // Dump stages
            writer.println(System.lineSeparator());
            writer.println("# Stages");
            list = GameData.getStageExcelMap().keySet().intStream().sorted().boxed().toList();
            for (int id : list) {
                StageExcel excel = GameData.getStageExcelMap().get(id);
                writer.print(excel.getId());
                writer.print(" : ");
                writer.print("[Level " + excel.getLevel() + "] ");
                writer.println(textMap.getOrDefault(excel.getStageName(), "null"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
