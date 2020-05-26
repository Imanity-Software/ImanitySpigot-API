package spg.lgdev.handler;

import net.minecraft.server.v1_8_R3.Entity;
import net.minecraft.server.v1_8_R3.PathfinderGoal;

public interface AIHandler {

    /**
     * Calls when an entity initializes its intelligence
     * @param entity - The entity object specified in the server
     * @return - false if you want to cancel this entity's intelligence and true if not
     */
    public boolean insertAI(Entity entity);

    /**
     * Calls when an entity initializes its pathfinder
     * @param entity - The entity object specified in the server
     * @return - false if you want to cancel this entity's pathfinder action and true if not
     */
    public boolean insertPathFinderGoal(Entity entity, PathfinderGoal pathfinderGoal);

}
