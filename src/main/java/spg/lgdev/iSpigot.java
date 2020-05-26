package spg.lgdev;

import com.google.common.collect.Sets;
import spg.lgdev.handler.AIHandler;
import spg.lgdev.handler.MovementHandler;
import spg.lgdev.handler.PacketHandler;
import spg.lgdev.knockback.KnockbackHandler;

import java.util.Set;

public enum iSpigot {

    INSTANCE;

    /**
     * Obtains the knockback handler for this iSpigot instance
     * @return The knockback handler for this server instance
     */
    public KnockbackHandler getKnockbackHandler() {
        return null;
    }

    /**
     * Obtains all PacketHandler instances in this iSpigot instance
     * @return The all packet handlers in this iSpigot instance
     */
    public Set<PacketHandler> getPacketHandlers() {
        return Sets.newHashSet();
    }

    /**
     * Obtains all MovementHandler instances in this iSpigot instance
     * @return The all movement handlers in this iSpigot instance
     */
    public Set<MovementHandler> getMovementHandlers() {
        return Sets.newHashSet();
    }

    /**
     * Obtains all AIHandler instances in this iSpigot instance
     * @return The all AI handlers in this iSpigot instance
     */
    public Set<AIHandler> getAIHandlers() {
        return Sets.newHashSet();
    }


    /**
     * Registers a PacketHandler instance into the server
     * @param handler - The PacketHandler instance created earlier
     */
    public void addPacketHandler(PacketHandler handler) { }

    /**
     * Registers a MovementHandler instance into the server
     * @param handler - The MovementHandler instance created earlier
     */
    public void addMovementHandler(MovementHandler handler) { }

    /**
     * Registers a AIHandler instance into the server
     * @param handler - The AIHandler instance created earlier
     */
    public void addAIHandler(AIHandler handler) { }

}
