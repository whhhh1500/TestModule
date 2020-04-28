package com.cc1500.nettyall.protobuf.protocol.message;

import lombok.Data;

import static com.cc1500.nettyall.protobuf.protocol.message.command.Command.HEARTBEAT_REQUEST;

/**
 * @author pjmike
 * @create 2018-10-25 16:12
 */
@Data
public class HeartbeatRequestPacket extends Packet {

    @Override
    public Byte getCommand() {
        return HEARTBEAT_REQUEST;
    }
}
