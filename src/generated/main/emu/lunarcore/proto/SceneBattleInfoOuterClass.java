// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedMessage;

public final class SceneBattleInfoOuterClass {
  /**
   * Protobuf type {@code SceneBattleInfo}
   */
  public static final class SceneBattleInfo extends ProtoMessage<SceneBattleInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 rounds_limit = 3;</code>
     */
    private int roundsLimit;

    /**
     * <code>optional uint32 logic_random_seed = 4;</code>
     */
    private int logicRandomSeed;

    /**
     * <code>optional uint32 stage_id = 5;</code>
     */
    private int stageId;

    /**
     * <code>optional uint32 world_level = 8;</code>
     */
    private int worldLevel;

    /**
     * <code>optional uint32 battle_id = 10;</code>
     */
    private int battleId;

    /**
     * <code>repeated .BattleAvatar battle_avatar_list = 1;</code>
     */
    private final RepeatedMessage<BattleAvatarOuterClass.BattleAvatar> battleAvatarList = RepeatedMessage.newEmptyInstance(BattleAvatarOuterClass.BattleAvatar.getFactory());

    /**
     * <code>repeated .SceneMonsterWave monster_wave_list = 9;</code>
     */
    private final RepeatedMessage<SceneMonsterWaveOuterClass.SceneMonsterWave> monsterWaveList = RepeatedMessage.newEmptyInstance(SceneMonsterWaveOuterClass.SceneMonsterWave.getFactory());

    /**
     * <code>repeated .BattleBuff buff_list = 13;</code>
     */
    private final RepeatedMessage<BattleBuffOuterClass.BattleBuff> buffList = RepeatedMessage.newEmptyInstance(BattleBuffOuterClass.BattleBuff.getFactory());

    private SceneBattleInfo() {
    }

    /**
     * @return a new empty instance of {@code SceneBattleInfo}
     */
    public static SceneBattleInfo newInstance() {
      return new SceneBattleInfo();
    }

    /**
     * <code>optional uint32 rounds_limit = 3;</code>
     * @return whether the roundsLimit field is set
     */
    public boolean hasRoundsLimit() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 rounds_limit = 3;</code>
     * @return this
     */
    public SceneBattleInfo clearRoundsLimit() {
      bitField0_ &= ~0x00000001;
      roundsLimit = 0;
      return this;
    }

    /**
     * <code>optional uint32 rounds_limit = 3;</code>
     * @return the roundsLimit
     */
    public int getRoundsLimit() {
      return roundsLimit;
    }

    /**
     * <code>optional uint32 rounds_limit = 3;</code>
     * @param value the roundsLimit to set
     * @return this
     */
    public SceneBattleInfo setRoundsLimit(final int value) {
      bitField0_ |= 0x00000001;
      roundsLimit = value;
      return this;
    }

    /**
     * <code>optional uint32 logic_random_seed = 4;</code>
     * @return whether the logicRandomSeed field is set
     */
    public boolean hasLogicRandomSeed() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 logic_random_seed = 4;</code>
     * @return this
     */
    public SceneBattleInfo clearLogicRandomSeed() {
      bitField0_ &= ~0x00000002;
      logicRandomSeed = 0;
      return this;
    }

    /**
     * <code>optional uint32 logic_random_seed = 4;</code>
     * @return the logicRandomSeed
     */
    public int getLogicRandomSeed() {
      return logicRandomSeed;
    }

    /**
     * <code>optional uint32 logic_random_seed = 4;</code>
     * @param value the logicRandomSeed to set
     * @return this
     */
    public SceneBattleInfo setLogicRandomSeed(final int value) {
      bitField0_ |= 0x00000002;
      logicRandomSeed = value;
      return this;
    }

    /**
     * <code>optional uint32 stage_id = 5;</code>
     * @return whether the stageId field is set
     */
    public boolean hasStageId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 stage_id = 5;</code>
     * @return this
     */
    public SceneBattleInfo clearStageId() {
      bitField0_ &= ~0x00000004;
      stageId = 0;
      return this;
    }

    /**
     * <code>optional uint32 stage_id = 5;</code>
     * @return the stageId
     */
    public int getStageId() {
      return stageId;
    }

    /**
     * <code>optional uint32 stage_id = 5;</code>
     * @param value the stageId to set
     * @return this
     */
    public SceneBattleInfo setStageId(final int value) {
      bitField0_ |= 0x00000004;
      stageId = value;
      return this;
    }

    /**
     * <code>optional uint32 world_level = 8;</code>
     * @return whether the worldLevel field is set
     */
    public boolean hasWorldLevel() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 world_level = 8;</code>
     * @return this
     */
    public SceneBattleInfo clearWorldLevel() {
      bitField0_ &= ~0x00000008;
      worldLevel = 0;
      return this;
    }

    /**
     * <code>optional uint32 world_level = 8;</code>
     * @return the worldLevel
     */
    public int getWorldLevel() {
      return worldLevel;
    }

    /**
     * <code>optional uint32 world_level = 8;</code>
     * @param value the worldLevel to set
     * @return this
     */
    public SceneBattleInfo setWorldLevel(final int value) {
      bitField0_ |= 0x00000008;
      worldLevel = value;
      return this;
    }

    /**
     * <code>optional uint32 battle_id = 10;</code>
     * @return whether the battleId field is set
     */
    public boolean hasBattleId() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional uint32 battle_id = 10;</code>
     * @return this
     */
    public SceneBattleInfo clearBattleId() {
      bitField0_ &= ~0x00000010;
      battleId = 0;
      return this;
    }

    /**
     * <code>optional uint32 battle_id = 10;</code>
     * @return the battleId
     */
    public int getBattleId() {
      return battleId;
    }

    /**
     * <code>optional uint32 battle_id = 10;</code>
     * @param value the battleId to set
     * @return this
     */
    public SceneBattleInfo setBattleId(final int value) {
      bitField0_ |= 0x00000010;
      battleId = value;
      return this;
    }

    /**
     * <code>repeated .BattleAvatar battle_avatar_list = 1;</code>
     * @return whether the battleAvatarList field is set
     */
    public boolean hasBattleAvatarList() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>repeated .BattleAvatar battle_avatar_list = 1;</code>
     * @return this
     */
    public SceneBattleInfo clearBattleAvatarList() {
      bitField0_ &= ~0x00000020;
      battleAvatarList.clear();
      return this;
    }

    /**
     * <code>repeated .BattleAvatar battle_avatar_list = 1;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableBattleAvatarList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<BattleAvatarOuterClass.BattleAvatar> getBattleAvatarList() {
      return battleAvatarList;
    }

    /**
     * <code>repeated .BattleAvatar battle_avatar_list = 1;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<BattleAvatarOuterClass.BattleAvatar> getMutableBattleAvatarList() {
      bitField0_ |= 0x00000020;
      return battleAvatarList;
    }

    /**
     * <code>repeated .BattleAvatar battle_avatar_list = 1;</code>
     * @param value the battleAvatarList to add
     * @return this
     */
    public SceneBattleInfo addBattleAvatarList(final BattleAvatarOuterClass.BattleAvatar value) {
      bitField0_ |= 0x00000020;
      battleAvatarList.add(value);
      return this;
    }

    /**
     * <code>repeated .BattleAvatar battle_avatar_list = 1;</code>
     * @param values the battleAvatarList to add
     * @return this
     */
    public SceneBattleInfo addAllBattleAvatarList(
        final BattleAvatarOuterClass.BattleAvatar... values) {
      bitField0_ |= 0x00000020;
      battleAvatarList.addAll(values);
      return this;
    }

    /**
     * <code>repeated .SceneMonsterWave monster_wave_list = 9;</code>
     * @return whether the monsterWaveList field is set
     */
    public boolean hasMonsterWaveList() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>repeated .SceneMonsterWave monster_wave_list = 9;</code>
     * @return this
     */
    public SceneBattleInfo clearMonsterWaveList() {
      bitField0_ &= ~0x00000040;
      monsterWaveList.clear();
      return this;
    }

    /**
     * <code>repeated .SceneMonsterWave monster_wave_list = 9;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMonsterWaveList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<SceneMonsterWaveOuterClass.SceneMonsterWave> getMonsterWaveList() {
      return monsterWaveList;
    }

    /**
     * <code>repeated .SceneMonsterWave monster_wave_list = 9;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<SceneMonsterWaveOuterClass.SceneMonsterWave> getMutableMonsterWaveList(
        ) {
      bitField0_ |= 0x00000040;
      return monsterWaveList;
    }

    /**
     * <code>repeated .SceneMonsterWave monster_wave_list = 9;</code>
     * @param value the monsterWaveList to add
     * @return this
     */
    public SceneBattleInfo addMonsterWaveList(
        final SceneMonsterWaveOuterClass.SceneMonsterWave value) {
      bitField0_ |= 0x00000040;
      monsterWaveList.add(value);
      return this;
    }

    /**
     * <code>repeated .SceneMonsterWave monster_wave_list = 9;</code>
     * @param values the monsterWaveList to add
     * @return this
     */
    public SceneBattleInfo addAllMonsterWaveList(
        final SceneMonsterWaveOuterClass.SceneMonsterWave... values) {
      bitField0_ |= 0x00000040;
      monsterWaveList.addAll(values);
      return this;
    }

    /**
     * <code>repeated .BattleBuff buff_list = 13;</code>
     * @return whether the buffList field is set
     */
    public boolean hasBuffList() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <code>repeated .BattleBuff buff_list = 13;</code>
     * @return this
     */
    public SceneBattleInfo clearBuffList() {
      bitField0_ &= ~0x00000080;
      buffList.clear();
      return this;
    }

    /**
     * <code>repeated .BattleBuff buff_list = 13;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableBuffList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<BattleBuffOuterClass.BattleBuff> getBuffList() {
      return buffList;
    }

    /**
     * <code>repeated .BattleBuff buff_list = 13;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<BattleBuffOuterClass.BattleBuff> getMutableBuffList() {
      bitField0_ |= 0x00000080;
      return buffList;
    }

    /**
     * <code>repeated .BattleBuff buff_list = 13;</code>
     * @param value the buffList to add
     * @return this
     */
    public SceneBattleInfo addBuffList(final BattleBuffOuterClass.BattleBuff value) {
      bitField0_ |= 0x00000080;
      buffList.add(value);
      return this;
    }

    /**
     * <code>repeated .BattleBuff buff_list = 13;</code>
     * @param values the buffList to add
     * @return this
     */
    public SceneBattleInfo addAllBuffList(final BattleBuffOuterClass.BattleBuff... values) {
      bitField0_ |= 0x00000080;
      buffList.addAll(values);
      return this;
    }

    @Override
    public SceneBattleInfo copyFrom(final SceneBattleInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        roundsLimit = other.roundsLimit;
        logicRandomSeed = other.logicRandomSeed;
        stageId = other.stageId;
        worldLevel = other.worldLevel;
        battleId = other.battleId;
        battleAvatarList.copyFrom(other.battleAvatarList);
        monsterWaveList.copyFrom(other.monsterWaveList);
        buffList.copyFrom(other.buffList);
      }
      return this;
    }

    @Override
    public SceneBattleInfo mergeFrom(final SceneBattleInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRoundsLimit()) {
        setRoundsLimit(other.roundsLimit);
      }
      if (other.hasLogicRandomSeed()) {
        setLogicRandomSeed(other.logicRandomSeed);
      }
      if (other.hasStageId()) {
        setStageId(other.stageId);
      }
      if (other.hasWorldLevel()) {
        setWorldLevel(other.worldLevel);
      }
      if (other.hasBattleId()) {
        setBattleId(other.battleId);
      }
      if (other.hasBattleAvatarList()) {
        getMutableBattleAvatarList().addAll(other.battleAvatarList);
      }
      if (other.hasMonsterWaveList()) {
        getMutableMonsterWaveList().addAll(other.monsterWaveList);
      }
      if (other.hasBuffList()) {
        getMutableBuffList().addAll(other.buffList);
      }
      return this;
    }

    @Override
    public SceneBattleInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      roundsLimit = 0;
      logicRandomSeed = 0;
      stageId = 0;
      worldLevel = 0;
      battleId = 0;
      battleAvatarList.clear();
      monsterWaveList.clear();
      buffList.clear();
      return this;
    }

    @Override
    public SceneBattleInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      battleAvatarList.clearQuick();
      monsterWaveList.clearQuick();
      buffList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SceneBattleInfo)) {
        return false;
      }
      SceneBattleInfo other = (SceneBattleInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasRoundsLimit() || roundsLimit == other.roundsLimit)
        && (!hasLogicRandomSeed() || logicRandomSeed == other.logicRandomSeed)
        && (!hasStageId() || stageId == other.stageId)
        && (!hasWorldLevel() || worldLevel == other.worldLevel)
        && (!hasBattleId() || battleId == other.battleId)
        && (!hasBattleAvatarList() || battleAvatarList.equals(other.battleAvatarList))
        && (!hasMonsterWaveList() || monsterWaveList.equals(other.monsterWaveList))
        && (!hasBuffList() || buffList.equals(other.buffList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(roundsLimit);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(logicRandomSeed);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(stageId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(worldLevel);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(battleId);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        for (int i = 0; i < battleAvatarList.length(); i++) {
          output.writeRawByte((byte) 10);
          output.writeMessageNoTag(battleAvatarList.get(i));
        }
      }
      if ((bitField0_ & 0x00000040) != 0) {
        for (int i = 0; i < monsterWaveList.length(); i++) {
          output.writeRawByte((byte) 74);
          output.writeMessageNoTag(monsterWaveList.get(i));
        }
      }
      if ((bitField0_ & 0x00000080) != 0) {
        for (int i = 0; i < buffList.length(); i++) {
          output.writeRawByte((byte) 106);
          output.writeMessageNoTag(buffList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(roundsLimit);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(logicRandomSeed);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(stageId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(worldLevel);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(battleId);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += (1 * battleAvatarList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(battleAvatarList);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += (1 * monsterWaveList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(monsterWaveList);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += (1 * buffList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(buffList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SceneBattleInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // roundsLimit
            roundsLimit = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 32) {
              break;
            }
          }
          case 32: {
            // logicRandomSeed
            logicRandomSeed = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // stageId
            stageId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // worldLevel
            worldLevel = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // battleId
            battleId = input.readUInt32();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 10) {
              break;
            }
          }
          case 10: {
            // battleAvatarList
            tag = input.readRepeatedMessage(battleAvatarList, tag);
            bitField0_ |= 0x00000020;
            if (tag != 74) {
              break;
            }
          }
          case 74: {
            // monsterWaveList
            tag = input.readRepeatedMessage(monsterWaveList, tag);
            bitField0_ |= 0x00000040;
            if (tag != 106) {
              break;
            }
          }
          case 106: {
            // buffList
            tag = input.readRepeatedMessage(buffList, tag);
            bitField0_ |= 0x00000080;
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.roundsLimit, roundsLimit);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.logicRandomSeed, logicRandomSeed);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.stageId, stageId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.worldLevel, worldLevel);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeUInt32(FieldNames.battleId, battleId);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRepeatedMessage(FieldNames.battleAvatarList, battleAvatarList);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRepeatedMessage(FieldNames.monsterWaveList, monsterWaveList);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRepeatedMessage(FieldNames.buffList, buffList);
      }
      output.endObject();
    }

    @Override
    public SceneBattleInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 306477590:
          case 1457479585: {
            if (input.isAtField(FieldNames.roundsLimit)) {
              if (!input.trySkipNullValue()) {
                roundsLimit = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 141999058:
          case -1894951668: {
            if (input.isAtField(FieldNames.logicRandomSeed)) {
              if (!input.trySkipNullValue()) {
                logicRandomSeed = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1897528135:
          case 1306191356: {
            if (input.isAtField(FieldNames.stageId)) {
              if (!input.trySkipNullValue()) {
                stageId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 440007442:
          case 1305257111: {
            if (input.isAtField(FieldNames.worldLevel)) {
              if (!input.trySkipNullValue()) {
                worldLevel = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1678308365:
          case -487930366: {
            if (input.isAtField(FieldNames.battleId)) {
              if (!input.trySkipNullValue()) {
                battleId = input.readUInt32();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 768292975:
          case 328463037: {
            if (input.isAtField(FieldNames.battleAvatarList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(battleAvatarList);
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 697746737:
          case -1492024321: {
            if (input.isAtField(FieldNames.monsterWaveList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(monsterWaveList);
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1522789487:
          case 55792906: {
            if (input.isAtField(FieldNames.buffList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(buffList);
                bitField0_ |= 0x00000080;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public SceneBattleInfo clone() {
      return new SceneBattleInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SceneBattleInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SceneBattleInfo(), data).checkInitialized();
    }

    public static SceneBattleInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneBattleInfo(), input).checkInitialized();
    }

    public static SceneBattleInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneBattleInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating SceneBattleInfo messages
     */
    public static MessageFactory<SceneBattleInfo> getFactory() {
      return SceneBattleInfoFactory.INSTANCE;
    }

    private enum SceneBattleInfoFactory implements MessageFactory<SceneBattleInfo> {
      INSTANCE;

      @Override
      public SceneBattleInfo create() {
        return SceneBattleInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName roundsLimit = FieldName.forField("roundsLimit", "rounds_limit");

      static final FieldName logicRandomSeed = FieldName.forField("logicRandomSeed", "logic_random_seed");

      static final FieldName stageId = FieldName.forField("stageId", "stage_id");

      static final FieldName worldLevel = FieldName.forField("worldLevel", "world_level");

      static final FieldName battleId = FieldName.forField("battleId", "battle_id");

      static final FieldName battleAvatarList = FieldName.forField("battleAvatarList", "battle_avatar_list");

      static final FieldName monsterWaveList = FieldName.forField("monsterWaveList", "monster_wave_list");

      static final FieldName buffList = FieldName.forField("buffList", "buff_list");
    }
  }
}
