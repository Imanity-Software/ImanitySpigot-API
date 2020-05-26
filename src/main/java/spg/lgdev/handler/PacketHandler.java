package spg.lgdev.handler;

import net.minecraft.server.v1_8_R3.Packet;
import net.minecraft.server.v1_8_R3.PlayerConnection;

public interface PacketHandler {

    /**
     * Calls when an InBound packet has been received
     * @param connection - The PlayerConnection object
     * @param packet - The InBound packet
     */
    void handleReceivedPacket(PlayerConnection connection, Packet packet);

    /**
     * Calls when an OutBound packet has been sent
     * @param connection - The PlayerConnection object
     * @param packet - The OutBound packet
     */
    void handleSentPacket(PlayerConnection connection, Packet packet);

    /**
     * Calls when an OutBound packet has been sent
     * @param connection - The PlayerConnection object
     * @param packet - The OutBound packet
     * @return - False if you want to cancel this packet, and False if not
     */
    default boolean handleSentPacketCancellable(PlayerConnection connection, Packet packet) {
        return true;
    }

}
