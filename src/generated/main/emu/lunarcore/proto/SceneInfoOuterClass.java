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

public final class SceneInfoOuterClass {
  /**
   * Protobuf type {@code SceneInfo}
   */
  public static final class SceneInfo extends ProtoMessage<SceneInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 world_id = 2;</code>
     */
    private int worldId;

    /**
     * <code>optional uint32 leader_entity_id = 5;</code>
     */
    private int leaderEntityId;

    /**
     * <code>optional uint32 floor_id = 6;</code>
     */
    private int floorId;

    /**
     * <code>optional uint32 client_pos_version = 7;</code>
     */
    private int clientPosVersion;

    /**
     * <code>optional uint32 game_mode_type = 10;</code>
     */
    private int gameModeType;

    /**
     * <code>optional uint32 plane_id = 12;</code>
     */
    private int planeId;

    /**
     * <code>optional uint32 entry_id = 14;</code>
     */
    private int entryId;

    /**
     * <code>repeated .SceneEntityInfo entity_list = 9;</code>
     */
    private final RepeatedMessage<SceneEntityInfoOuterClass.SceneEntityInfo> entityList = RepeatedMessage.newEmptyInstance(SceneEntityInfoOuterClass.SceneEntityInfo.getFactory());

    /**
     * <code>repeated .SceneEntityGroupInfo entity_group_list = 469;</code>
     */
    private final RepeatedMessage<SceneEntityGroupInfoOuterClass.SceneEntityGroupInfo> entityGroupList = RepeatedMessage.newEmptyInstance(SceneEntityGroupInfoOuterClass.SceneEntityGroupInfo.getFactory());

    /**
     * <code>repeated .SceneGroupState group_state_list = 743;</code>
     */
    private final RepeatedMessage<SceneGroupStateOuterClass.SceneGroupState> groupStateList = RepeatedMessage.newEmptyInstance(SceneGroupStateOuterClass.SceneGroupState.getFactory());

    private SceneInfo() {
    }

    /**
     * @return a new empty instance of {@code SceneInfo}
     */
    public static SceneInfo newInstance() {
      return new SceneInfo();
    }

    /**
     * <code>optional uint32 world_id = 2;</code>
     * @return whether the worldId field is set
     */
    public boolean hasWorldId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 world_id = 2;</code>
     * @return this
     */
    public SceneInfo clearWorldId() {
      bitField0_ &= ~0x00000001;
      worldId = 0;
      return this;
    }

    /**
     * <code>optional uint32 world_id = 2;</code>
     * @return the worldId
     */
    public int getWorldId() {
      return worldId;
    }

    /**
     * <code>optional uint32 world_id = 2;</code>
     * @param value the worldId to set
     * @return this
     */
    public SceneInfo setWorldId(final int value) {
      bitField0_ |= 0x00000001;
      worldId = value;
      return this;
    }

    /**
     * <code>optional uint32 leader_entity_id = 5;</code>
     * @return whether the leaderEntityId field is set
     */
    public boolean hasLeaderEntityId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 leader_entity_id = 5;</code>
     * @return this
     */
    public SceneInfo clearLeaderEntityId() {
      bitField0_ &= ~0x00000002;
      leaderEntityId = 0;
      return this;
    }

    /**
     * <code>optional uint32 leader_entity_id = 5;</code>
     * @return the leaderEntityId
     */
    public int getLeaderEntityId() {
      return leaderEntityId;
    }

    /**
     * <code>optional uint32 leader_entity_id = 5;</code>
     * @param value the leaderEntityId to set
     * @return this
     */
    public SceneInfo setLeaderEntityId(final int value) {
      bitField0_ |= 0x00000002;
      leaderEntityId = value;
      return this;
    }

    /**
     * <code>optional uint32 floor_id = 6;</code>
     * @return whether the floorId field is set
     */
    public boolean hasFloorId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 floor_id = 6;</code>
     * @return this
     */
    public SceneInfo clearFloorId() {
      bitField0_ &= ~0x00000004;
      floorId = 0;
      return this;
    }

    /**
     * <code>optional uint32 floor_id = 6;</code>
     * @return the floorId
     */
    public int getFloorId() {
      return floorId;
    }

    /**
     * <code>optional uint32 floor_id = 6;</code>
     * @param value the floorId to set
     * @return this
     */
    public SceneInfo setFloorId(final int value) {
      bitField0_ |= 0x00000004;
      floorId = value;
      return this;
    }

    /**
     * <code>optional uint32 client_pos_version = 7;</code>
     * @return whether the clientPosVersion field is set
     */
    public boolean hasClientPosVersion() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 client_pos_version = 7;</code>
     * @return this
     */
    public SceneInfo clearClientPosVersion() {
      bitField0_ &= ~0x00000008;
      clientPosVersion = 0;
      return this;
    }

    /**
     * <code>optional uint32 client_pos_version = 7;</code>
     * @return the clientPosVersion
     */
    public int getClientPosVersion() {
      return clientPosVersion;
    }

    /**
     * <code>optional uint32 client_pos_version = 7;</code>
     * @param value the clientPosVersion to set
     * @return this
     */
    public SceneInfo setClientPosVersion(final int value) {
      bitField0_ |= 0x00000008;
      clientPosVersion = value;
      return this;
    }

    /**
     * <code>optional uint32 game_mode_type = 10;</code>
     * @return whether the gameModeType field is set
     */
    public boolean hasGameModeType() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional uint32 game_mode_type = 10;</code>
     * @return this
     */
    public SceneInfo clearGameModeType() {
      bitField0_ &= ~0x00000010;
      gameModeType = 0;
      return this;
    }

    /**
     * <code>optional uint32 game_mode_type = 10;</code>
     * @return the gameModeType
     */
    public int getGameModeType() {
      return gameModeType;
    }

    /**
     * <code>optional uint32 game_mode_type = 10;</code>
     * @param value the gameModeType to set
     * @return this
     */
    public SceneInfo setGameModeType(final int value) {
      bitField0_ |= 0x00000010;
      gameModeType = value;
      return this;
    }

    /**
     * <code>optional uint32 plane_id = 12;</code>
     * @return whether the planeId field is set
     */
    public boolean hasPlaneId() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional uint32 plane_id = 12;</code>
     * @return this
     */
    public SceneInfo clearPlaneId() {
      bitField0_ &= ~0x00000020;
      planeId = 0;
      return this;
    }

    /**
     * <code>optional uint32 plane_id = 12;</code>
     * @return the planeId
     */
    public int getPlaneId() {
      return planeId;
    }

    /**
     * <code>optional uint32 plane_id = 12;</code>
     * @param value the planeId to set
     * @return this
     */
    public SceneInfo setPlaneId(final int value) {
      bitField0_ |= 0x00000020;
      planeId = value;
      return this;
    }

    /**
     * <code>optional uint32 entry_id = 14;</code>
     * @return whether the entryId field is set
     */
    public boolean hasEntryId() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>optional uint32 entry_id = 14;</code>
     * @return this
     */
    public SceneInfo clearEntryId() {
      bitField0_ &= ~0x00000040;
      entryId = 0;
      return this;
    }

    /**
     * <code>optional uint32 entry_id = 14;</code>
     * @return the entryId
     */
    public int getEntryId() {
      return entryId;
    }

    /**
     * <code>optional uint32 entry_id = 14;</code>
     * @param value the entryId to set
     * @return this
     */
    public SceneInfo setEntryId(final int value) {
      bitField0_ |= 0x00000040;
      entryId = value;
      return this;
    }

    /**
     * <code>repeated .SceneEntityInfo entity_list = 9;</code>
     * @return whether the entityList field is set
     */
    public boolean hasEntityList() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <code>repeated .SceneEntityInfo entity_list = 9;</code>
     * @return this
     */
    public SceneInfo clearEntityList() {
      bitField0_ &= ~0x00000080;
      entityList.clear();
      return this;
    }

    /**
     * <code>repeated .SceneEntityInfo entity_list = 9;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableEntityList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<SceneEntityInfoOuterClass.SceneEntityInfo> getEntityList() {
      return entityList;
    }

    /**
     * <code>repeated .SceneEntityInfo entity_list = 9;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<SceneEntityInfoOuterClass.SceneEntityInfo> getMutableEntityList() {
      bitField0_ |= 0x00000080;
      return entityList;
    }

    /**
     * <code>repeated .SceneEntityInfo entity_list = 9;</code>
     * @param value the entityList to add
     * @return this
     */
    public SceneInfo addEntityList(final SceneEntityInfoOuterClass.SceneEntityInfo value) {
      bitField0_ |= 0x00000080;
      entityList.add(value);
      return this;
    }

    /**
     * <code>repeated .SceneEntityInfo entity_list = 9;</code>
     * @param values the entityList to add
     * @return this
     */
    public SceneInfo addAllEntityList(final SceneEntityInfoOuterClass.SceneEntityInfo... values) {
      bitField0_ |= 0x00000080;
      entityList.addAll(values);
      return this;
    }

    /**
     * <code>repeated .SceneEntityGroupInfo entity_group_list = 469;</code>
     * @return whether the entityGroupList field is set
     */
    public boolean hasEntityGroupList() {
      return (bitField0_ & 0x00000100) != 0;
    }

    /**
     * <code>repeated .SceneEntityGroupInfo entity_group_list = 469;</code>
     * @return this
     */
    public SceneInfo clearEntityGroupList() {
      bitField0_ &= ~0x00000100;
      entityGroupList.clear();
      return this;
    }

    /**
     * <code>repeated .SceneEntityGroupInfo entity_group_list = 469;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableEntityGroupList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<SceneEntityGroupInfoOuterClass.SceneEntityGroupInfo> getEntityGroupList(
        ) {
      return entityGroupList;
    }

    /**
     * <code>repeated .SceneEntityGroupInfo entity_group_list = 469;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<SceneEntityGroupInfoOuterClass.SceneEntityGroupInfo> getMutableEntityGroupList(
        ) {
      bitField0_ |= 0x00000100;
      return entityGroupList;
    }

    /**
     * <code>repeated .SceneEntityGroupInfo entity_group_list = 469;</code>
     * @param value the entityGroupList to add
     * @return this
     */
    public SceneInfo addEntityGroupList(
        final SceneEntityGroupInfoOuterClass.SceneEntityGroupInfo value) {
      bitField0_ |= 0x00000100;
      entityGroupList.add(value);
      return this;
    }

    /**
     * <code>repeated .SceneEntityGroupInfo entity_group_list = 469;</code>
     * @param values the entityGroupList to add
     * @return this
     */
    public SceneInfo addAllEntityGroupList(
        final SceneEntityGroupInfoOuterClass.SceneEntityGroupInfo... values) {
      bitField0_ |= 0x00000100;
      entityGroupList.addAll(values);
      return this;
    }

    /**
     * <code>repeated .SceneGroupState group_state_list = 743;</code>
     * @return whether the groupStateList field is set
     */
    public boolean hasGroupStateList() {
      return (bitField0_ & 0x00000200) != 0;
    }

    /**
     * <code>repeated .SceneGroupState group_state_list = 743;</code>
     * @return this
     */
    public SceneInfo clearGroupStateList() {
      bitField0_ &= ~0x00000200;
      groupStateList.clear();
      return this;
    }

    /**
     * <code>repeated .SceneGroupState group_state_list = 743;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableGroupStateList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<SceneGroupStateOuterClass.SceneGroupState> getGroupStateList() {
      return groupStateList;
    }

    /**
     * <code>repeated .SceneGroupState group_state_list = 743;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<SceneGroupStateOuterClass.SceneGroupState> getMutableGroupStateList() {
      bitField0_ |= 0x00000200;
      return groupStateList;
    }

    /**
     * <code>repeated .SceneGroupState group_state_list = 743;</code>
     * @param value the groupStateList to add
     * @return this
     */
    public SceneInfo addGroupStateList(final SceneGroupStateOuterClass.SceneGroupState value) {
      bitField0_ |= 0x00000200;
      groupStateList.add(value);
      return this;
    }

    /**
     * <code>repeated .SceneGroupState group_state_list = 743;</code>
     * @param values the groupStateList to add
     * @return this
     */
    public SceneInfo addAllGroupStateList(
        final SceneGroupStateOuterClass.SceneGroupState... values) {
      bitField0_ |= 0x00000200;
      groupStateList.addAll(values);
      return this;
    }

    @Override
    public SceneInfo copyFrom(final SceneInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        worldId = other.worldId;
        leaderEntityId = other.leaderEntityId;
        floorId = other.floorId;
        clientPosVersion = other.clientPosVersion;
        gameModeType = other.gameModeType;
        planeId = other.planeId;
        entryId = other.entryId;
        entityList.copyFrom(other.entityList);
        entityGroupList.copyFrom(other.entityGroupList);
        groupStateList.copyFrom(other.groupStateList);
      }
      return this;
    }

    @Override
    public SceneInfo mergeFrom(final SceneInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasWorldId()) {
        setWorldId(other.worldId);
      }
      if (other.hasLeaderEntityId()) {
        setLeaderEntityId(other.leaderEntityId);
      }
      if (other.hasFloorId()) {
        setFloorId(other.floorId);
      }
      if (other.hasClientPosVersion()) {
        setClientPosVersion(other.clientPosVersion);
      }
      if (other.hasGameModeType()) {
        setGameModeType(other.gameModeType);
      }
      if (other.hasPlaneId()) {
        setPlaneId(other.planeId);
      }
      if (other.hasEntryId()) {
        setEntryId(other.entryId);
      }
      if (other.hasEntityList()) {
        getMutableEntityList().addAll(other.entityList);
      }
      if (other.hasEntityGroupList()) {
        getMutableEntityGroupList().addAll(other.entityGroupList);
      }
      if (other.hasGroupStateList()) {
        getMutableGroupStateList().addAll(other.groupStateList);
      }
      return this;
    }

    @Override
    public SceneInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      worldId = 0;
      leaderEntityId = 0;
      floorId = 0;
      clientPosVersion = 0;
      gameModeType = 0;
      planeId = 0;
      entryId = 0;
      entityList.clear();
      entityGroupList.clear();
      groupStateList.clear();
      return this;
    }

    @Override
    public SceneInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      entityList.clearQuick();
      entityGroupList.clearQuick();
      groupStateList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SceneInfo)) {
        return false;
      }
      SceneInfo other = (SceneInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasWorldId() || worldId == other.worldId)
        && (!hasLeaderEntityId() || leaderEntityId == other.leaderEntityId)
        && (!hasFloorId() || floorId == other.floorId)
        && (!hasClientPosVersion() || clientPosVersion == other.clientPosVersion)
        && (!hasGameModeType() || gameModeType == other.gameModeType)
        && (!hasPlaneId() || planeId == other.planeId)
        && (!hasEntryId() || entryId == other.entryId)
        && (!hasEntityList() || entityList.equals(other.entityList))
        && (!hasEntityGroupList() || entityGroupList.equals(other.entityGroupList))
        && (!hasGroupStateList() || groupStateList.equals(other.groupStateList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(worldId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(leaderEntityId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(floorId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(clientPosVersion);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(gameModeType);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(planeId);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(entryId);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        for (int i = 0; i < entityList.length(); i++) {
          output.writeRawByte((byte) 74);
          output.writeMessageNoTag(entityList.get(i));
        }
      }
      if ((bitField0_ & 0x00000100) != 0) {
        for (int i = 0; i < entityGroupList.length(); i++) {
          output.writeRawLittleEndian16((short) 7594);
          output.writeMessageNoTag(entityGroupList.get(i));
        }
      }
      if ((bitField0_ & 0x00000200) != 0) {
        for (int i = 0; i < groupStateList.length(); i++) {
          output.writeRawLittleEndian16((short) 11962);
          output.writeMessageNoTag(groupStateList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(worldId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(leaderEntityId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(floorId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(clientPosVersion);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(gameModeType);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(planeId);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(entryId);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += (1 * entityList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(entityList);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        size += (2 * entityGroupList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(entityGroupList);
      }
      if ((bitField0_ & 0x00000200) != 0) {
        size += (2 * groupStateList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(groupStateList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SceneInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 16: {
            // worldId
            worldId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // leaderEntityId
            leaderEntityId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // floorId
            floorId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // clientPosVersion
            clientPosVersion = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // gameModeType
            gameModeType = input.readUInt32();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // planeId
            planeId = input.readUInt32();
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // entryId
            entryId = input.readUInt32();
            bitField0_ |= 0x00000040;
            tag = input.readTag();
            if (tag != 74) {
              break;
            }
          }
          case 74: {
            // entityList
            tag = input.readRepeatedMessage(entityList, tag);
            bitField0_ |= 0x00000080;
            if (tag != 3754) {
              break;
            }
          }
          case 3754: {
            // entityGroupList
            tag = input.readRepeatedMessage(entityGroupList, tag);
            bitField0_ |= 0x00000100;
            if (tag != 5946) {
              break;
            }
          }
          case 5946: {
            // groupStateList
            tag = input.readRepeatedMessage(groupStateList, tag);
            bitField0_ |= 0x00000200;
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
        output.writeUInt32(FieldNames.worldId, worldId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.leaderEntityId, leaderEntityId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.floorId, floorId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.clientPosVersion, clientPosVersion);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeUInt32(FieldNames.gameModeType, gameModeType);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeUInt32(FieldNames.planeId, planeId);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeUInt32(FieldNames.entryId, entryId);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRepeatedMessage(FieldNames.entityList, entityList);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        output.writeRepeatedMessage(FieldNames.entityGroupList, entityGroupList);
      }
      if ((bitField0_ & 0x00000200) != 0) {
        output.writeRepeatedMessage(FieldNames.groupStateList, groupStateList);
      }
      output.endObject();
    }

    @Override
    public SceneInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1525188685:
          case 36230376: {
            if (input.isAtField(FieldNames.worldId)) {
              if (!input.trySkipNullValue()) {
                worldId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1693061255:
          case 794634049: {
            if (input.isAtField(FieldNames.leaderEntityId)) {
              if (!input.trySkipNullValue()) {
                leaderEntityId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -766027193:
          case 2022982190: {
            if (input.isAtField(FieldNames.floorId)) {
              if (!input.trySkipNullValue()) {
                floorId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1787644431:
          case 1278860153: {
            if (input.isAtField(FieldNames.clientPosVersion)) {
              if (!input.trySkipNullValue()) {
                clientPosVersion = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -464498289:
          case 1937775689: {
            if (input.isAtField(FieldNames.gameModeType)) {
              if (!input.trySkipNullValue()) {
                gameModeType = input.readUInt32();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -493896553:
          case 1869097438: {
            if (input.isAtField(FieldNames.planeId)) {
              if (!input.trySkipNullValue()) {
                planeId = input.readUInt32();
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1591558867:
          case -2093663224: {
            if (input.isAtField(FieldNames.entryId)) {
              if (!input.trySkipNullValue()) {
                entryId = input.readUInt32();
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1483251935:
          case 1281457018: {
            if (input.isAtField(FieldNames.entityList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(entityList);
                bitField0_ |= 0x00000080;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -914706662:
          case 1589108794: {
            if (input.isAtField(FieldNames.entityGroupList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(entityGroupList);
                bitField0_ |= 0x00000100;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1415397648:
          case 1198817612: {
            if (input.isAtField(FieldNames.groupStateList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(groupStateList);
                bitField0_ |= 0x00000200;
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
    public SceneInfo clone() {
      return new SceneInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SceneInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SceneInfo(), data).checkInitialized();
    }

    public static SceneInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneInfo(), input).checkInitialized();
    }

    public static SceneInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating SceneInfo messages
     */
    public static MessageFactory<SceneInfo> getFactory() {
      return SceneInfoFactory.INSTANCE;
    }

    private enum SceneInfoFactory implements MessageFactory<SceneInfo> {
      INSTANCE;

      @Override
      public SceneInfo create() {
        return SceneInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName worldId = FieldName.forField("worldId", "world_id");

      static final FieldName leaderEntityId = FieldName.forField("leaderEntityId", "leader_entity_id");

      static final FieldName floorId = FieldName.forField("floorId", "floor_id");

      static final FieldName clientPosVersion = FieldName.forField("clientPosVersion", "client_pos_version");

      static final FieldName gameModeType = FieldName.forField("gameModeType", "game_mode_type");

      static final FieldName planeId = FieldName.forField("planeId", "plane_id");

      static final FieldName entryId = FieldName.forField("entryId", "entry_id");

      static final FieldName entityList = FieldName.forField("entityList", "entity_list");

      static final FieldName entityGroupList = FieldName.forField("entityGroupList", "entity_group_list");

      static final FieldName groupStateList = FieldName.forField("groupStateList", "group_state_list");
    }
  }
}
