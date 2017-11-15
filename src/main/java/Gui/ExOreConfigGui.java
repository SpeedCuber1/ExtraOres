package Gui;

import com.tylerh.extraores.Util.ConfigHandler;
import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 1/4/2017.
 */
public class ExOreConfigGui extends GuiConfig
{
    public ExOreConfigGui(GuiScreen parentScreen)
    {
        super(parentScreen,properties, ModInfo.MOD_ID,ModInfo.GUI_CATEGORY,false,true,"Extra Ores");
    }
    private static Configuration config = ConfigHandler.getConfig();
    private static ConfigElement category_ore = new ConfigElement(config.getCategory(ModInfo.GUI_CATEGORY));
    private static List<IConfigElement> properties = category_ore.getChildElements();
}
