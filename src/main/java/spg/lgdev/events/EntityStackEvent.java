package spg.lgdev.events;

import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;

public class EntityStackEvent extends EntityEvent implements Cancellable {

    private Entity stacker;
    private boolean cancelled;

    public EntityStackEvent(Entity entity, Entity stacker) {
        super(entity);

        this.stacker = stacker;
    }

    private static HandlerList handlers = new HandlerList();

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public Entity getStacker() {
        return stacker;
    }
}
