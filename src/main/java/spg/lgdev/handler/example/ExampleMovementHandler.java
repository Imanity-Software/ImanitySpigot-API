package spg.lgdev.handler.example;

import net.minecraft.server.v1_8_R3.PacketPlayInFlying;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import spg.lgdev.handler.MovementHandler;

public class ExampleMovementHandler implements MovementHandler {

    @Override
    public void handleUpdateLocation(Player player, Location to, Location from, PacketPlayInFlying packet) {
        if (from.getBlockX() == to.getBlockX()
                && from.getBlockY() == to.getBlockY()
                && from.getBlockZ() == from.getBlockZ()) {
            return;
        }

        player.teleport(from);
        player.sendMessage("Don't try to move!");
    }

    @Override
    public void handleUpdateRotation(Player player, Location to, Location from, PacketPlayInFlying packet) {
    }

}
