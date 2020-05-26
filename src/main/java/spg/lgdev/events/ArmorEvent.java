package spg.lgdev.events;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.ItemStack;
import spg.lgdev.events.type.ArmorType;

public abstract class ArmorEvent extends PlayerEvent {

    private ArmorType armorType;
    private ItemStack previous;

    public ArmorType getArmorType() {
        return this.armorType;
    }

    public ItemStack getPrevious() {
        return this.previous;
    }

    public ArmorEvent(Player player, ArmorType armorType, ItemStack previous) {
        super(player);

        this.armorType = armorType;
        this.previous = previous;
    }

}
