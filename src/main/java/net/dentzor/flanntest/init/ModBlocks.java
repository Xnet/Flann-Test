package net.dentzor.flanntest.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.dentzor.flanntest.block.BlockCore;
import net.dentzor.flanntest.block.BlockPodium;
import net.dentzor.flanntest.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockCore podium = new BlockPodium();

    public static void init()
    {
        GameRegistry.registerBlock(podium, "podium");
    }
}
