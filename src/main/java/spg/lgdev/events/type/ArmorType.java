package spg.lgdev.events.type;

import org.bukkit.Material;

public enum ArmorType {
    HELMET(3),
    CHESTPLATE(2),
    LEGGINGS(1),
    BOOTS(0);

    private int slot;

    ArmorType(int slot) {
        this.slot = slot;
    }

    public int getSlot() {
        return this.slot;
    }

    public static ArmorType getFromSlot(int slot) {
        for (ArmorType armorType : ArmorType.values()) {
            if (armorType.slot == slot) {
                return armorType;
            }
        }
        return null;
    }

    public static ArmorType getFromMaterial(Material material) {
        for (ArmorType armorType : ArmorType.values()) {
            if (material.name().endsWith(armorType.name())) {
                return armorType;
            }
        }
        return null;
    }
}
