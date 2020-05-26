package spg.lgdev.handler;

import net.minecraft.server.v1_8_R3.PacketPlayInFlying;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface MovementHandler {

	/**
	 * Calls when a player tries to move himself that the original and target location are not in the same block
	 * @param player - The player object
	 * @param to - The target location
	 * @param from - The original location
	 * @param packet - The packet instance which could be utilized in this method
	 */
	void handleUpdateLocation(Player player, Location to, Location from, PacketPlayInFlying packet);

	/**
	 * Calls when a player tries to rotate himself
	 * @param player - The player object
	 * @param to - The target location
	 * @param from - The original location
	 * @param packet - The packet instance which could be utilized in this method
	 */
	void handleUpdateRotation(Player player, Location to, Location from, PacketPlayInFlying packet);

}
