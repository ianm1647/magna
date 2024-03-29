package dev.draylar.magna.config;

import draylar.omegaconfig.api.Comment;
import draylar.omegaconfig.api.Config;

public class MagnaConfig implements Config {
    @Comment(value = "Whether an extended hitbox should show air blocks (or other blocks without hitboxes).")
    public boolean highlightAirBlocks = false;

    @Comment(value = "Whether non-full blocks (stairs, slabs) should be represented by a full cube in extended hitboxes.")
    public boolean fullBlockShapes = false;

    @Comment(value = "Whether extended hitboxes should be enabled for the appropriate tools.")
    public boolean enableExtendedHitbox = true;

    @Comment(value = "Whether block breaking should show animation on all blocks.")
    public boolean enableAllBlockBreakingAnimation = true;

    @Comment(value = "Whether extended hitboxes should be disabled when the player is sneaking.")
    public boolean disableExtendedHitboxWhileSneaking = true;

    @Comment(value = "Whether only a single block should be disabled when the player is sneaking.")
    public boolean breakSingleBlockWhenSneaking = true;

    @Comment(value = "Whether each block in an extended hitbox should show its outline separately.")
    public boolean individualBlockOutlines = false;

    @Comment(value = "If true, dropped items are automatically inserted into the inventory.")
    public boolean autoPickup = false;

    @Override
    public String getName() {
        return "magna";
    }
}