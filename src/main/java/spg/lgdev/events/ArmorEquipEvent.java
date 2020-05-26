package spg.lgdev.events;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import spg.lgdev.events.type.ArmorType;

public class ArmorEquipEvent extends ArmorEvent
{
    private ItemStack newArmor;

    public ArmorEquipEvent(final Player p, ArmorType armorType, ItemStack previous, final ItemStack newArmor) {
        super(p, armorType, previous);
        this.newArmor = newArmor;
    }

    public ItemStack getNewArmor() {
        return this.newArmor;
    }

    public void setNewArmor(ItemStack newArmor) {
        this.newArmor = newArmor;
    }

    private static HandlerList handlers = new HandlerList();

    @Override
    public HandlerList getHandlers() {
        return ArmorEquipEvent.handlers;
    }

    public static HandlerList getHandlerList() {
        return ArmorEquipEvent.handlers;
    }

}
