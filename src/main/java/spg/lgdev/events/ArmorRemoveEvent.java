package spg.lgdev.events;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import spg.lgdev.events.type.ArmorType;

public class ArmorRemoveEvent extends ArmorEvent {
    public ArmorRemoveEvent(final Player p, ArmorType armorType, ItemStack previous) {
        super(p, armorType, previous);
    }

    private static HandlerList handlers = new HandlerList();

    @Override
    public HandlerList getHandlers() {
        return ArmorRemoveEvent.handlers;
    }

    public static HandlerList getHandlerList() {
        return ArmorRemoveEvent.handlers;
    }
}
