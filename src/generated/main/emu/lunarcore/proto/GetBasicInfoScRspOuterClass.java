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

public final class GetBasicInfoScRspOuterClass {
  /**
   * Protobuf type {@code GetBasicInfoScRsp}
   */
  public static final class GetBasicInfoScRsp extends ProtoMessage<GetBasicInfoScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional int64 next_recover_time = 7;</code>
     */
    private long nextRecoverTime;

    /**
     * <code>optional int64 last_set_nickname_time = 9;</code>
     */
    private long lastSetNicknameTime;

    /**
     * <code>optional uint32 cur_day = 3;</code>
     */
    private int curDay;

    /**
     * <code>optional uint32 gameplay_birthday = 4;</code>
     */
    private int gameplayBirthday;

    /**
     * <code>optional uint32 retcode = 11;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 week_cocoon_finished_count = 13;</code>
     */
    private int weekCocoonFinishedCount;

    /**
     * <code>optional uint32 exchange_times = 15;</code>
     */
    private int exchangeTimes;

    /**
     * <code>optional .PlayerSettingInfo player_setting_info = 1;</code>
     */
    private final PlayerSettingInfoOuterClass.PlayerSettingInfo playerSettingInfo = PlayerSettingInfoOuterClass.PlayerSettingInfo.newInstance();

    private GetBasicInfoScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetBasicInfoScRsp}
     */
    public static GetBasicInfoScRsp newInstance() {
      return new GetBasicInfoScRsp();
    }

    /**
     * <code>optional int64 next_recover_time = 7;</code>
     * @return whether the nextRecoverTime field is set
     */
    public boolean hasNextRecoverTime() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional int64 next_recover_time = 7;</code>
     * @return this
     */
    public GetBasicInfoScRsp clearNextRecoverTime() {
      bitField0_ &= ~0x00000001;
      nextRecoverTime = 0L;
      return this;
    }

    /**
     * <code>optional int64 next_recover_time = 7;</code>
     * @return the nextRecoverTime
     */
    public long getNextRecoverTime() {
      return nextRecoverTime;
    }

    /**
     * <code>optional int64 next_recover_time = 7;</code>
     * @param value the nextRecoverTime to set
     * @return this
     */
    public GetBasicInfoScRsp setNextRecoverTime(final long value) {
      bitField0_ |= 0x00000001;
      nextRecoverTime = value;
      return this;
    }

    /**
     * <code>optional int64 last_set_nickname_time = 9;</code>
     * @return whether the lastSetNicknameTime field is set
     */
    public boolean hasLastSetNicknameTime() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional int64 last_set_nickname_time = 9;</code>
     * @return this
     */
    public GetBasicInfoScRsp clearLastSetNicknameTime() {
      bitField0_ &= ~0x00000002;
      lastSetNicknameTime = 0L;
      return this;
    }

    /**
     * <code>optional int64 last_set_nickname_time = 9;</code>
     * @return the lastSetNicknameTime
     */
    public long getLastSetNicknameTime() {
      return lastSetNicknameTime;
    }

    /**
     * <code>optional int64 last_set_nickname_time = 9;</code>
     * @param value the lastSetNicknameTime to set
     * @return this
     */
    public GetBasicInfoScRsp setLastSetNicknameTime(final long value) {
      bitField0_ |= 0x00000002;
      lastSetNicknameTime = value;
      return this;
    }

    /**
     * <code>optional uint32 cur_day = 3;</code>
     * @return whether the curDay field is set
     */
    public boolean hasCurDay() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 cur_day = 3;</code>
     * @return this
     */
    public GetBasicInfoScRsp clearCurDay() {
      bitField0_ &= ~0x00000004;
      curDay = 0;
      return this;
    }

    /**
     * <code>optional uint32 cur_day = 3;</code>
     * @return the curDay
     */
    public int getCurDay() {
      return curDay;
    }

    /**
     * <code>optional uint32 cur_day = 3;</code>
     * @param value the curDay to set
     * @return this
     */
    public GetBasicInfoScRsp setCurDay(final int value) {
      bitField0_ |= 0x00000004;
      curDay = value;
      return this;
    }

    /**
     * <code>optional uint32 gameplay_birthday = 4;</code>
     * @return whether the gameplayBirthday field is set
     */
    public boolean hasGameplayBirthday() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 gameplay_birthday = 4;</code>
     * @return this
     */
    public GetBasicInfoScRsp clearGameplayBirthday() {
      bitField0_ &= ~0x00000008;
      gameplayBirthday = 0;
      return this;
    }

    /**
     * <code>optional uint32 gameplay_birthday = 4;</code>
     * @return the gameplayBirthday
     */
    public int getGameplayBirthday() {
      return gameplayBirthday;
    }

    /**
     * <code>optional uint32 gameplay_birthday = 4;</code>
     * @param value the gameplayBirthday to set
     * @return this
     */
    public GetBasicInfoScRsp setGameplayBirthday(final int value) {
      bitField0_ |= 0x00000008;
      gameplayBirthday = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @return this
     */
    public GetBasicInfoScRsp clearRetcode() {
      bitField0_ &= ~0x00000010;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 11;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetBasicInfoScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000010;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 week_cocoon_finished_count = 13;</code>
     * @return whether the weekCocoonFinishedCount field is set
     */
    public boolean hasWeekCocoonFinishedCount() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional uint32 week_cocoon_finished_count = 13;</code>
     * @return this
     */
    public GetBasicInfoScRsp clearWeekCocoonFinishedCount() {
      bitField0_ &= ~0x00000020;
      weekCocoonFinishedCount = 0;
      return this;
    }

    /**
     * <code>optional uint32 week_cocoon_finished_count = 13;</code>
     * @return the weekCocoonFinishedCount
     */
    public int getWeekCocoonFinishedCount() {
      return weekCocoonFinishedCount;
    }

    /**
     * <code>optional uint32 week_cocoon_finished_count = 13;</code>
     * @param value the weekCocoonFinishedCount to set
     * @return this
     */
    public GetBasicInfoScRsp setWeekCocoonFinishedCount(final int value) {
      bitField0_ |= 0x00000020;
      weekCocoonFinishedCount = value;
      return this;
    }

    /**
     * <code>optional uint32 exchange_times = 15;</code>
     * @return whether the exchangeTimes field is set
     */
    public boolean hasExchangeTimes() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>optional uint32 exchange_times = 15;</code>
     * @return this
     */
    public GetBasicInfoScRsp clearExchangeTimes() {
      bitField0_ &= ~0x00000040;
      exchangeTimes = 0;
      return this;
    }

    /**
     * <code>optional uint32 exchange_times = 15;</code>
     * @return the exchangeTimes
     */
    public int getExchangeTimes() {
      return exchangeTimes;
    }

    /**
     * <code>optional uint32 exchange_times = 15;</code>
     * @param value the exchangeTimes to set
     * @return this
     */
    public GetBasicInfoScRsp setExchangeTimes(final int value) {
      bitField0_ |= 0x00000040;
      exchangeTimes = value;
      return this;
    }

    /**
     * <code>optional .PlayerSettingInfo player_setting_info = 1;</code>
     * @return whether the playerSettingInfo field is set
     */
    public boolean hasPlayerSettingInfo() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <code>optional .PlayerSettingInfo player_setting_info = 1;</code>
     * @return this
     */
    public GetBasicInfoScRsp clearPlayerSettingInfo() {
      bitField0_ &= ~0x00000080;
      playerSettingInfo.clear();
      return this;
    }

    /**
     * <code>optional .PlayerSettingInfo player_setting_info = 1;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutablePlayerSettingInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public PlayerSettingInfoOuterClass.PlayerSettingInfo getPlayerSettingInfo() {
      return playerSettingInfo;
    }

    /**
     * <code>optional .PlayerSettingInfo player_setting_info = 1;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public PlayerSettingInfoOuterClass.PlayerSettingInfo getMutablePlayerSettingInfo() {
      bitField0_ |= 0x00000080;
      return playerSettingInfo;
    }

    /**
     * <code>optional .PlayerSettingInfo player_setting_info = 1;</code>
     * @param value the playerSettingInfo to set
     * @return this
     */
    public GetBasicInfoScRsp setPlayerSettingInfo(
        final PlayerSettingInfoOuterClass.PlayerSettingInfo value) {
      bitField0_ |= 0x00000080;
      playerSettingInfo.copyFrom(value);
      return this;
    }

    @Override
    public GetBasicInfoScRsp copyFrom(final GetBasicInfoScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        nextRecoverTime = other.nextRecoverTime;
        lastSetNicknameTime = other.lastSetNicknameTime;
        curDay = other.curDay;
        gameplayBirthday = other.gameplayBirthday;
        retcode = other.retcode;
        weekCocoonFinishedCount = other.weekCocoonFinishedCount;
        exchangeTimes = other.exchangeTimes;
        playerSettingInfo.copyFrom(other.playerSettingInfo);
      }
      return this;
    }

    @Override
    public GetBasicInfoScRsp mergeFrom(final GetBasicInfoScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasNextRecoverTime()) {
        setNextRecoverTime(other.nextRecoverTime);
      }
      if (other.hasLastSetNicknameTime()) {
        setLastSetNicknameTime(other.lastSetNicknameTime);
      }
      if (other.hasCurDay()) {
        setCurDay(other.curDay);
      }
      if (other.hasGameplayBirthday()) {
        setGameplayBirthday(other.gameplayBirthday);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasWeekCocoonFinishedCount()) {
        setWeekCocoonFinishedCount(other.weekCocoonFinishedCount);
      }
      if (other.hasExchangeTimes()) {
        setExchangeTimes(other.exchangeTimes);
      }
      if (other.hasPlayerSettingInfo()) {
        getMutablePlayerSettingInfo().mergeFrom(other.playerSettingInfo);
      }
      return this;
    }

    @Override
    public GetBasicInfoScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      nextRecoverTime = 0L;
      lastSetNicknameTime = 0L;
      curDay = 0;
      gameplayBirthday = 0;
      retcode = 0;
      weekCocoonFinishedCount = 0;
      exchangeTimes = 0;
      playerSettingInfo.clear();
      return this;
    }

    @Override
    public GetBasicInfoScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      playerSettingInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetBasicInfoScRsp)) {
        return false;
      }
      GetBasicInfoScRsp other = (GetBasicInfoScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasNextRecoverTime() || nextRecoverTime == other.nextRecoverTime)
        && (!hasLastSetNicknameTime() || lastSetNicknameTime == other.lastSetNicknameTime)
        && (!hasCurDay() || curDay == other.curDay)
        && (!hasGameplayBirthday() || gameplayBirthday == other.gameplayBirthday)
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasWeekCocoonFinishedCount() || weekCocoonFinishedCount == other.weekCocoonFinishedCount)
        && (!hasExchangeTimes() || exchangeTimes == other.exchangeTimes)
        && (!hasPlayerSettingInfo() || playerSettingInfo.equals(other.playerSettingInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 56);
        output.writeInt64NoTag(nextRecoverTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 72);
        output.writeInt64NoTag(lastSetNicknameTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(curDay);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(gameplayBirthday);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(weekCocoonFinishedCount);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(exchangeTimes);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRawByte((byte) 10);
        output.writeMessageNoTag(playerSettingInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeInt64SizeNoTag(nextRecoverTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeInt64SizeNoTag(lastSetNicknameTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(curDay);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(gameplayBirthday);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(weekCocoonFinishedCount);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(exchangeTimes);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(playerSettingInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetBasicInfoScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 56: {
            // nextRecoverTime
            nextRecoverTime = input.readInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // lastSetNicknameTime
            lastSetNicknameTime = input.readInt64();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 24) {
              break;
            }
          }
          case 24: {
            // curDay
            curDay = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 32) {
              break;
            }
          }
          case 32: {
            // gameplayBirthday
            gameplayBirthday = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // weekCocoonFinishedCount
            weekCocoonFinishedCount = input.readUInt32();
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // exchangeTimes
            exchangeTimes = input.readUInt32();
            bitField0_ |= 0x00000040;
            tag = input.readTag();
            if (tag != 10) {
              break;
            }
          }
          case 10: {
            // playerSettingInfo
            input.readMessage(playerSettingInfo);
            bitField0_ |= 0x00000080;
            tag = input.readTag();
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
        output.writeInt64(FieldNames.nextRecoverTime, nextRecoverTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeInt64(FieldNames.lastSetNicknameTime, lastSetNicknameTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.curDay, curDay);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.gameplayBirthday, gameplayBirthday);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeUInt32(FieldNames.weekCocoonFinishedCount, weekCocoonFinishedCount);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeUInt32(FieldNames.exchangeTimes, exchangeTimes);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeMessage(FieldNames.playerSettingInfo, playerSettingInfo);
      }
      output.endObject();
    }

    @Override
    public GetBasicInfoScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1964148386:
          case 394600084: {
            if (input.isAtField(FieldNames.nextRecoverTime)) {
              if (!input.trySkipNullValue()) {
                nextRecoverTime = input.readInt64();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1278606439:
          case 400029048: {
            if (input.isAtField(FieldNames.lastSetNicknameTime)) {
              if (!input.trySkipNullValue()) {
                lastSetNicknameTime = input.readInt64();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1349164740:
          case 1126372637: {
            if (input.isAtField(FieldNames.curDay)) {
              if (!input.trySkipNullValue()) {
                curDay = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 686542531:
          case 172986486: {
            if (input.isAtField(FieldNames.gameplayBirthday)) {
              if (!input.trySkipNullValue()) {
                gameplayBirthday = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1387396786:
          case 668486783: {
            if (input.isAtField(FieldNames.weekCocoonFinishedCount)) {
              if (!input.trySkipNullValue()) {
                weekCocoonFinishedCount = input.readUInt32();
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1371137763:
          case -119434710: {
            if (input.isAtField(FieldNames.exchangeTimes)) {
              if (!input.trySkipNullValue()) {
                exchangeTimes = input.readUInt32();
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 616260989:
          case -1071462949: {
            if (input.isAtField(FieldNames.playerSettingInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(playerSettingInfo);
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
    public GetBasicInfoScRsp clone() {
      return new GetBasicInfoScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetBasicInfoScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetBasicInfoScRsp(), data).checkInitialized();
    }

    public static GetBasicInfoScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetBasicInfoScRsp(), input).checkInitialized();
    }

    public static GetBasicInfoScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetBasicInfoScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetBasicInfoScRsp messages
     */
    public static MessageFactory<GetBasicInfoScRsp> getFactory() {
      return GetBasicInfoScRspFactory.INSTANCE;
    }

    private enum GetBasicInfoScRspFactory implements MessageFactory<GetBasicInfoScRsp> {
      INSTANCE;

      @Override
      public GetBasicInfoScRsp create() {
        return GetBasicInfoScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName nextRecoverTime = FieldName.forField("nextRecoverTime", "next_recover_time");

      static final FieldName lastSetNicknameTime = FieldName.forField("lastSetNicknameTime", "last_set_nickname_time");

      static final FieldName curDay = FieldName.forField("curDay", "cur_day");

      static final FieldName gameplayBirthday = FieldName.forField("gameplayBirthday", "gameplay_birthday");

      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName weekCocoonFinishedCount = FieldName.forField("weekCocoonFinishedCount", "week_cocoon_finished_count");

      static final FieldName exchangeTimes = FieldName.forField("exchangeTimes", "exchange_times");

      static final FieldName playerSettingInfo = FieldName.forField("playerSettingInfo", "player_setting_info");
    }
  }
}
