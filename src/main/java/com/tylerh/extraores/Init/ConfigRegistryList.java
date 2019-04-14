package com.tylerh.extraores.Init;

import com.tylerh.extraores.Util.ModInfo;
import net.minecraftforge.common.ForgeConfigSpec;

public class ConfigRegistryList
{
    public static ForgeConfigSpec.BooleanValue registerAdamantine;
    public static ForgeConfigSpec.BooleanValue registerAldourite;
    public static ForgeConfigSpec.BooleanValue registerAluminum;
    public static ForgeConfigSpec.BooleanValue registerAmordrine;
    public static ForgeConfigSpec.BooleanValue registerAngmallen;
    public static ForgeConfigSpec.BooleanValue registerAstralSilver;
    public static ForgeConfigSpec.BooleanValue registerAtlarus;
    public static ForgeConfigSpec.BooleanValue registerBismuth;
    public static ForgeConfigSpec.BooleanValue registerBlackSteel;
    public static ForgeConfigSpec.BooleanValue registerCadmium;
    public static ForgeConfigSpec.BooleanValue registerCarmot;
    public static ForgeConfigSpec.BooleanValue registerCelenegil;
    public static ForgeConfigSpec.BooleanValue registerCeruclase;
    public static ForgeConfigSpec.BooleanValue registerChromium;
    public static ForgeConfigSpec.BooleanValue registerCobalt;
    public static ForgeConfigSpec.BooleanValue registerCopper;
    public static ForgeConfigSpec.BooleanValue registerDeepIron;
    public static ForgeConfigSpec.BooleanValue registerGallium;
    public static ForgeConfigSpec.BooleanValue registerHaderoth;
    public static ForgeConfigSpec.BooleanValue registerHepatizon;
    public static ForgeConfigSpec.BooleanValue registerIgnatius;
    public static ForgeConfigSpec.BooleanValue registerIndium;
    public static ForgeConfigSpec.BooleanValue registerInfuscolium;
    public static ForgeConfigSpec.BooleanValue registerInolashite;
    public static ForgeConfigSpec.BooleanValue registerKalendrite;
    public static ForgeConfigSpec.BooleanValue registerLead;
    public static ForgeConfigSpec.BooleanValue registerLemurite;
    public static ForgeConfigSpec.BooleanValue registerManganese;
    public static ForgeConfigSpec.BooleanValue registerMidasium;
    public static ForgeConfigSpec.BooleanValue registerMithril;
    public static ForgeConfigSpec.BooleanValue registerMolybdenum;
    public static ForgeConfigSpec.BooleanValue registerNeodymium;
    public static ForgeConfigSpec.BooleanValue registerNickel;
    public static ForgeConfigSpec.BooleanValue registerNiobium;
    public static ForgeConfigSpec.BooleanValue registerOrichalcum;
    public static ForgeConfigSpec.BooleanValue registerOureclase;
    public static ForgeConfigSpec.BooleanValue registerPalladium;
    public static ForgeConfigSpec.BooleanValue registerPlatinum;
    public static ForgeConfigSpec.BooleanValue registerPrometheum;
    public static ForgeConfigSpec.BooleanValue registerRhodium;
    public static ForgeConfigSpec.BooleanValue registerRuthenium;
    public static ForgeConfigSpec.BooleanValue registerRubracium;
    public static ForgeConfigSpec.BooleanValue registerSanguinite;
    public static ForgeConfigSpec.BooleanValue registerShadowIron;
    public static ForgeConfigSpec.BooleanValue registerSilver;
    public static ForgeConfigSpec.BooleanValue registerTechnetium;
    public static ForgeConfigSpec.BooleanValue registerThallium;
    public static ForgeConfigSpec.BooleanValue registerTin;
    public static ForgeConfigSpec.BooleanValue registerTitanium;
    public static ForgeConfigSpec.BooleanValue registerTungsten;
    public static ForgeConfigSpec.BooleanValue registerUnobtainium;
    public static ForgeConfigSpec.BooleanValue registerVanadium;
    public static ForgeConfigSpec.BooleanValue registerVulcanite;
    public static ForgeConfigSpec.BooleanValue registerVyroxeres;
    public static ForgeConfigSpec.BooleanValue registerZinc;
    public static ForgeConfigSpec.BooleanValue registerZirconium;

    public static void initConfig(ForgeConfigSpec.Builder builder)
    {
        registerAdamantine = builder.comment("Enable/Disable Adamantine").define("Adamantine", ModInfo.GUI_DEFAULT_VALUE);
        registerAldourite = builder.comment("Enable/Disable Aldourite").define("Aldourite",ModInfo.GUI_DEFAULT_VALUE);
        registerAluminum = builder.comment("Enable/Disable Aluminum").define("Aluminum",ModInfo.GUI_DEFAULT_VALUE);
        registerAmordrine = builder.comment("Enable/Disable Amordrine").define("Amordrine",ModInfo.GUI_DEFAULT_VALUE);
        registerAngmallen = builder.comment("Enable/Disable Angmallen").define("Angmallen",ModInfo.GUI_DEFAULT_VALUE);
        registerAstralSilver = builder.comment("Enable/Disable Astral Silver").define("Astral Silver",ModInfo.GUI_DEFAULT_VALUE);
        registerAtlarus = builder.comment("Enable/Disable Atlarus").define("Atlarus",ModInfo.GUI_DEFAULT_VALUE);
        registerBismuth = builder.comment("Enable/Disable Bismuth").define("Bismuth",ModInfo.GUI_DEFAULT_VALUE);
        registerBlackSteel = builder.comment("Enable/Disable Black Steel").define("Black Steel",ModInfo.GUI_DEFAULT_VALUE);
        registerCadmium = builder.comment("Enable/Disable Cadmium").define("Cadmium",ModInfo.GUI_DEFAULT_VALUE);
        registerCarmot = builder.comment("Enable/Disable Carmot").define("Carmot",ModInfo.GUI_DEFAULT_VALUE);
    }
}
