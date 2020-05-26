package spg.lgdev.events;

import net.minecraft.server.v1_8_R3.EntityPlayer;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import spg.lgdev.knockback.impl.AbstractKnockback;

public class ReachEvent extends Event
{
    private static final HandlerList handlers;
    private EntityPlayer player;
    private double distanceSqrt;
    private double distance;

    public ReachEvent(final EntityPlayer player, final double distanceSqrt) {
        this.player = player;
        this.distanceSqrt = distanceSqrt;
        this.distance = AbstractKnockback.invSqrt(distanceSqrt);
    }

    public EntityPlayer getPlayer() {
        return this.player;
    }

    public double getDistance() {
        return this.distance;
    }

    public double getDistanceSqrt() {
        return this.distanceSqrt;
    }

    @Override
    public HandlerList getHandlers() {
        return ReachEvent.handlers;
    }

    public static HandlerList getHandlerList() {
        return ReachEvent.handlers;
    }

    static {
        handlers = new HandlerList();
    }
}
