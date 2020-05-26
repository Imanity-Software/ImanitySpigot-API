package spg.lgdev.handler.example;

import net.minecraft.server.v1_8_R3.Entity;
import net.minecraft.server.v1_8_R3.EntityCreeper;
import net.minecraft.server.v1_8_R3.EntityEnderman;
import net.minecraft.server.v1_8_R3.PathfinderGoal;
import spg.lgdev.handler.AIHandler;

public class ExampleAIHandler implements AIHandler {

    @Override
    public boolean insertAI(Entity entity) {
        if (entity instanceof EntityCreeper || entity instanceof EntityEnderman) {
            return false;
        }
        return true;
    }

    @Override
    public boolean insertPathFinderGoal(Entity entity, PathfinderGoal pathfinderGoal) {
        if (entity instanceof EntityCreeper || entity instanceof EntityEnderman) {
            return false;
        }
        return true;
    }
}
