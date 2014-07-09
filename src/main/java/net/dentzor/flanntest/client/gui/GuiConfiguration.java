package net.dentzor.flanntest.client.gui;

import cpw.mods.fml.client.config.GuiConfig;
import net.dentzor.flanntest.handler.ConfigurationHandler;
import net.dentzor.flanntest.reference.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.ConfigElement;

import java.util.List;

public class GuiConfiguration extends GuiConfig
{

    public GuiConfiguration(GuiScreen guiScreen) {
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString())
                );
    }
}
