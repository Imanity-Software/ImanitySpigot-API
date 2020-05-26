package spg.lgdev.events;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

public class PlayerAttackEvent
        extends PlayerEvent
{
    private static final HandlerList handlers = new HandlerList();

    public PlayerAttackEvent(Player player)
    {
        super(player);
    }

    public HandlerList getHandlers()
    {
        return handlers;
    }

    public static HandlerList getHandlerList()
    {
        return handlers;
    }
}