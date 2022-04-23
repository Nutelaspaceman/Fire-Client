package dev.zprestige.fire.module.visual.crosshair;

import dev.zprestige.fire.event.bus.EventListener;
import dev.zprestige.fire.event.impl.RenderOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

public class RenderOverlayListener extends EventListener<RenderOverlayEvent, Crosshair> {

    public RenderOverlayListener(final Crosshair crosshair) {
        super(RenderOverlayEvent.class, crosshair);
    }

    @Override
    public void invoke(final Object object) {
        final RenderOverlayEvent event = (RenderOverlayEvent) object;
        if (event.getType().equals(RenderGameOverlayEvent.ElementType.CROSSHAIRS)) {
            event.setCancelled();
        }
    }
}
