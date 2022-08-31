package org.imnobody.plugins.slate.customitems;

import net.minecraft.world.inventory.ClickAction;
import org.bukkit.event.player.PlayerInteractEvent;

public interface CustomItem {

    void handleLeft(PlayerInteractEvent event);

    void handleRight(PlayerInteractEvent event);
}
