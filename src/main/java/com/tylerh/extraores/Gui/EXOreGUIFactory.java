package com.tylerh.extraores.Gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;

import java.util.Set;

/**
 * Created by User on 1/4/2017.
 */
public class EXOreGUIFactory implements IModGuiFactory
{

    @Override
    public void initialize(Minecraft minecraftInstance)
    {

    }
    @Override
    public GuiScreen createConfigGui(GuiScreen parentSceen)
    {
        return new ExOreConfigGui(parentSceen);
    }
    @Override
    public boolean hasConfigGui()
    {
        return true;
    }
    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories()
    {
        return null;
    }
}
