package com.tylerh.extraores.Util;

import com.tylerh.extraores.Init.InitBlocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * Created by Tyler on 4/29/2016.
 */
public class EXOreWorldGen implements IWorldGenerator
{
    private WorldGenerator adamantineOre;
    private WorldGenerator agateOre;
    private WorldGenerator aldouriteOre;
    private WorldGenerator aluminumOre;
    private WorldGenerator americiumOre;
    private WorldGenerator amethystOre;
    private WorldGenerator ametrineOre;
    private WorldGenerator amordrineOre;
    private WorldGenerator angmallenOre;
    private WorldGenerator aquamarineOre;
    private WorldGenerator astralSilverOre;
    private WorldGenerator atlarusOre;
    private WorldGenerator bismuthOre;
    private WorldGenerator blackSteelOre;
    private WorldGenerator cadmiumOre;
    private WorldGenerator carmotOre;
    private WorldGenerator celenegilOre;
    private WorldGenerator ceruclaseOre;
    private WorldGenerator chromiumOre;
    private WorldGenerator chrysocollaOre;
    private WorldGenerator citrineOre;
    private WorldGenerator cobaltOre;
    private WorldGenerator copperOre;
    private WorldGenerator deepIronOre;
    private WorldGenerator desichalkosOre;
    private WorldGenerator eximiteOre;
    private WorldGenerator galliumOre;
    private WorldGenerator garnetOre;
    private WorldGenerator haderothOre;
    private WorldGenerator hepatizonOre;
    private WorldGenerator ignatiusOre;
    private WorldGenerator indiumOre;
    private WorldGenerator infuscoliumOre;
    private WorldGenerator inolashiteOre;
    private WorldGenerator ioliteOre;
    private WorldGenerator iridiumOre;
    private WorldGenerator jadeOre;
    private WorldGenerator jasperOre;
    private WorldGenerator kalendriteOre;
    private WorldGenerator kyaniteOre;
    private WorldGenerator leadOre;
    private WorldGenerator lemuriteOre;
    private WorldGenerator malachiteOre;
    private WorldGenerator manganeseOre;
    private WorldGenerator meutoiteOre;
    private WorldGenerator midasiumOre;
    private WorldGenerator mithrilOre;
    private WorldGenerator molybdenumOre;
    private WorldGenerator neodymiumOre;
    private WorldGenerator neptuniumOre;
    private WorldGenerator nickelOre;
    private WorldGenerator niobiumOre;
    private WorldGenerator onyxOre;
    private WorldGenerator opalOre;
    private WorldGenerator orichalcumOre;
    private WorldGenerator osmiumOre;
    private WorldGenerator oureclaseOre;
    private WorldGenerator palladiumOre;
    private WorldGenerator peridotOre;
    private WorldGenerator phoenixiteOre;
    private WorldGenerator platinumOre;
    private WorldGenerator plutoniumOre;
    private WorldGenerator poloniumOre;
    private WorldGenerator promethiumOre;
    private WorldGenerator quartzOre;
    private WorldGenerator rheniumOre;
    private WorldGenerator rhodiumOre;
    private WorldGenerator rubraciumOre;
    private WorldGenerator rubyOre;
    private WorldGenerator rutheniumOre;
    private WorldGenerator sanguiniteOre;
    private WorldGenerator sapphireOre;
    private WorldGenerator shadowIronOre;
    private WorldGenerator silverOre;
    private WorldGenerator spinelOre;
    private WorldGenerator sugiliteOre;
    private WorldGenerator tantalumOre;
    private WorldGenerator tanzaniteOre;
    private WorldGenerator tartariteOre;
    private WorldGenerator technetiumOre;
    private WorldGenerator thalliumOre;
    private WorldGenerator tinOre;
    private WorldGenerator titaniumOre;
    private WorldGenerator topazOre;
    private WorldGenerator tourmalineOre;
    private WorldGenerator tungstenOre;
    private WorldGenerator turquoiseOre;
    private WorldGenerator unobtainiumOre;
    private WorldGenerator uraniumOre;
    private WorldGenerator vanadiumOre;
    private WorldGenerator vulcaniteOre;
    private WorldGenerator vyroxeresOre;
    private WorldGenerator yelloriteOre;
    private WorldGenerator zincOre;
    private WorldGenerator zirconiumOre;
    public EXOreWorldGen()
    {
        if(InitBlocks.registerAdamantine)
        {
            this.adamantineOre = new EXOreWorldGenMinable(InitBlocks.blockOreAdamantine.getDefaultState(),4);
        }
        if(InitBlocks.registerAgate)
        {
            this.agateOre = new EXOreWorldGenMinable(InitBlocks.blockOreAgate.getDefaultState(), 4);
        }
        if(InitBlocks.registerAldourite)
        {
            this.aldouriteOre = new EXOreWorldGenMinable(InitBlocks.blockOreAldourite.getDefaultState(),4,new NetherPredicate());
        }
        if(InitBlocks.registerAluminum)
        {
            this.aluminumOre = new EXOreWorldGenMinable(InitBlocks.blockOreAluminum.getDefaultState(), 4);
        }
        if(InitBlocks.registerAmericium)
        {
            this.americiumOre = new EXOreWorldGenMinable(InitBlocks.blockOreAmericium.getDefaultState(),4);
        }
        if(InitBlocks.registerAmethyst)
        {
            this.amethystOre = new EXOreWorldGenMinable(InitBlocks.blockOreAmethyst.getDefaultState(),4);
        }
        if(InitBlocks.registerAmetrine)
        {
            this.ametrineOre = new EXOreWorldGenMinable(InitBlocks.blockOreAmetrine.getDefaultState(), 4);
        }
        if(InitBlocks.registerAmordrine)
        {
            this.amordrineOre = new EXOreWorldGenMinable(InitBlocks.blockOreAmordrine.getDefaultState(),4);
        }
        if(InitBlocks.registerAngmallen)
        {
            this.angmallenOre = new EXOreWorldGenMinable(InitBlocks.blockOreAngmallen.getDefaultState(),4);
        }
        if(InitBlocks.registerAquamarine)
        {
            this.aquamarineOre = new EXOreWorldGenMinable(InitBlocks.blockOreAquamarine.getDefaultState(),4);
        }
        if(InitBlocks.registerAstralSilver)
        {
            this.astralSilverOre = new EXOreWorldGenMinable(InitBlocks.blockOreAstralSilver.getDefaultState(),4);
        }
        if(InitBlocks.registerAtlarus)
        {
            this.atlarusOre = new EXOreWorldGenMinable(InitBlocks.blockOreAtlarus.getDefaultState(),4);
        }
        if(InitBlocks.registerBismuth)
        {
            this.bismuthOre = new EXOreWorldGenMinable(InitBlocks.blockOreBismuth.getDefaultState(), 4);
        }
        if(InitBlocks.registerBlackSteel)
        {
            this.blackSteelOre = new EXOreWorldGenMinable(InitBlocks.blockOreBlackSteel.getDefaultState(),4);
        }
        if(InitBlocks.registerCadmium)
        {
            this.cadmiumOre = new EXOreWorldGenMinable(InitBlocks.blockOreCadmium.getDefaultState(), 4);
        }
        if(InitBlocks.registerCarmot)
        {
            this.carmotOre = new EXOreWorldGenMinable(InitBlocks.blockOreCarmot.getDefaultState(),4);
        }
        if(InitBlocks.registerCelenegil)
        {
            this.celenegilOre = new EXOreWorldGenMinable(InitBlocks.blockOreCelenegil.getDefaultState(),4);
        }
        if(InitBlocks.registerCeruclase)
        {
            this.ceruclaseOre = new EXOreWorldGenMinable(InitBlocks.blockOreCeruclase.getDefaultState(),4,new NetherPredicate());
        }
        if(InitBlocks.registerChromium)
        {
            this.chromiumOre = new EXOreWorldGenMinable(InitBlocks.blockOreChromium.getDefaultState(), 4);
        }
        if(InitBlocks.registerChrysocolla)
        {
            this.chrysocollaOre = new EXOreWorldGenMinable(InitBlocks.blockOreChrysocolla.getDefaultState(), 4);
        }
        if(InitBlocks.registerCitrine)
        {
            this.citrineOre = new EXOreWorldGenMinable(InitBlocks.blockOreCitrine.getDefaultState(), 4);
        }
        if(InitBlocks.registerCobalt)
        {
            this.cobaltOre = new EXOreWorldGenMinable(InitBlocks.blockOreCobalt.getDefaultState(), 4);
        }
        if(InitBlocks.registerCopper)
        {
            this.copperOre = new EXOreWorldGenMinable(InitBlocks.blockOreCopper.getDefaultState(), 4);
        }
        if(InitBlocks.registerDeepIron)
        {
            this.deepIronOre = new EXOreWorldGenMinable(InitBlocks.blockOreDeepIron.getDefaultState(),4);
        }
        if(InitBlocks.registerDesichalkos)
        {
            this.desichalkosOre = new EXOreWorldGenMinable(InitBlocks.blockOreDesichalkos.getDefaultState(),4);
        }
        if(InitBlocks.registerEximite)
        {
            this.eximiteOre = new EXOreWorldGenMinable(InitBlocks.blockOreEximite.getDefaultState(),4);
        }
        if(InitBlocks.registerGallium)
        {
            this.galliumOre = new EXOreWorldGenMinable(InitBlocks.blockOreGallium.getDefaultState(), 4);
        }
        if(InitBlocks.registerGarnet)
        {
            this.garnetOre = new EXOreWorldGenMinable(InitBlocks.blockOreGarnet.getDefaultState(), 4);
        }
        if(InitBlocks.registerHaderoth)
        {
            this.haderothOre = new EXOreWorldGenMinable(InitBlocks.blockOreHaderoth.getDefaultState(),4);
        }
        if(InitBlocks.registerHepatizon)
        {
            this.hepatizonOre = new EXOreWorldGenMinable(InitBlocks.blockOreHepatizon.getDefaultState(),4);
        }
        if(InitBlocks.registerIgnatius)
        {
            this.ignatiusOre = new EXOreWorldGenMinable(InitBlocks.blockOreIgnatius.getDefaultState(),4,new NetherPredicate());
        }
        if(InitBlocks.registerIndium)
        {
            this.indiumOre = new EXOreWorldGenMinable(InitBlocks.blockOreIndium.getDefaultState(), 4);
        }
        if(InitBlocks.registerInfuscolium)
        {
            this.infuscoliumOre = new EXOreWorldGenMinable(InitBlocks.blockOreInfuscolium.getDefaultState(),4);
        }
        if(InitBlocks.registerInolashite)
        {
            this.inolashiteOre = new EXOreWorldGenMinable(InitBlocks.blockOreInolashite.getDefaultState(),4);
        }
        if(InitBlocks.registerIolite)
        {
            this.ioliteOre = new EXOreWorldGenMinable(InitBlocks.blockOreIolite.getDefaultState(),4);
        }
        if(InitBlocks.registerIridium)
        {
            this.iridiumOre = new EXOreWorldGenMinable(InitBlocks.blockOreIridium.getDefaultState(), 4);
        }
        if(InitBlocks.registerJade)
        {
            this.jadeOre = new EXOreWorldGenMinable(InitBlocks.blockOreJade.getDefaultState(), 4);
        }
        if(InitBlocks.registerJasper)
        {
            this.jasperOre = new EXOreWorldGenMinable(InitBlocks.blockOreJasper.getDefaultState(), 4);
        }
        if(InitBlocks.registerKalendrite)
        {
            this.kalendriteOre = new EXOreWorldGenMinable(InitBlocks.blockOreKalendrite.getDefaultState(),4,new NetherPredicate());
        }
        if(InitBlocks.registerKyanite)
        {
            this.kyaniteOre = new EXOreWorldGenMinable(InitBlocks.blockOreKyanite.getDefaultState(), 4);
        }
        if(InitBlocks.registerLead)
        {
            this.leadOre = new EXOreWorldGenMinable(InitBlocks.blockOreLead.getDefaultState(), 4);
        }
        if(InitBlocks.registerLemurite)
        {
            this.lemuriteOre = new EXOreWorldGenMinable(InitBlocks.blockOreLemurite.getDefaultState(),4,new NetherPredicate());
        }
        if(InitBlocks.registerMalachite)
        {
            this.malachiteOre = new EXOreWorldGenMinable(InitBlocks.blockOreMalachite.getDefaultState(), 4);
        }
        if(InitBlocks.registerManganese)
        {
            this.manganeseOre = new EXOreWorldGenMinable(InitBlocks.blockOreManganese.getDefaultState(), 4);
        }
        if(InitBlocks.registerMeutoite)
        {
            this.meutoiteOre = new EXOreWorldGenMinable(InitBlocks.blockOreMeutoite.getDefaultState(),4);
        }
        if(InitBlocks.registerMidasium)
        {
            this.midasiumOre = new EXOreWorldGenMinable(InitBlocks.blockOreMidasium.getDefaultState(),4,new NetherPredicate());
        }
        if(InitBlocks.registerMithril)
        {
            this.mithrilOre = new EXOreWorldGenMinable(InitBlocks.blockOreMithril.getDefaultState(),4);
        }
        if(InitBlocks.registerMolybdenum)
        {
            this.molybdenumOre = new EXOreWorldGenMinable(InitBlocks.blockOreMolybdenum.getDefaultState(), 4);
        }
        if(InitBlocks.registerNeodymium)
        {
            this.neodymiumOre = new EXOreWorldGenMinable(InitBlocks.blockOreNeodymium.getDefaultState(), 4);
        }
        if(InitBlocks.registerNeptunium)
        {
            this.neptuniumOre = new EXOreWorldGenMinable(InitBlocks.blockOreNeptunium.getDefaultState(), 4);
        }
        if(InitBlocks.registerNickel)
        {
            this.nickelOre = new EXOreWorldGenMinable(InitBlocks.blockOreNickel.getDefaultState(), 4);
        }
        if(InitBlocks.registerNiobium)
        {
            this.niobiumOre = new EXOreWorldGenMinable(InitBlocks.blockOreNiobium.getDefaultState(), 4);
        }
        if(InitBlocks.registerOnyx)
        {
            this.onyxOre = new EXOreWorldGenMinable(InitBlocks.blockOreMalachite.getDefaultState(), 4);
        }
        if(InitBlocks.registerOpal)
        {
            this.opalOre = new EXOreWorldGenMinable(InitBlocks.blockOreOpal.getDefaultState(), 4);
        }
        if(InitBlocks.registerOrichalcum)
        {
            this.orichalcumOre = new EXOreWorldGenMinable(InitBlocks.blockOreOrichalcum.getDefaultState(),4);
        }
        if(InitBlocks.registerOsmium)
        {
            this.osmiumOre = new EXOreWorldGenMinable(InitBlocks.blockOreOsmium.getDefaultState(), 4);
        }
        if(InitBlocks.registerOureclase)
        {
            this.oureclaseOre = new EXOreWorldGenMinable(InitBlocks.blockOreOureclase.getDefaultState(),4);
        }
        if(InitBlocks.registerPalladium)
        {
            this.palladiumOre = new EXOreWorldGenMinable(InitBlocks.blockOrePalladium.getDefaultState(), 4);
        }
        if(InitBlocks.registerPeridot)
        {
            this.peridotOre = new EXOreWorldGenMinable(InitBlocks.blockOrePeridot.getDefaultState(), 4);
        }
        if(InitBlocks.registerPhoenixite)
        {
            this.phoenixiteOre = new EXOreWorldGenMinable(InitBlocks.blockOrePhoenixite.getDefaultState(), 4);
        }
        if(InitBlocks.registerPlatinum)
        {
            this.platinumOre = new EXOreWorldGenMinable(InitBlocks.blockOrePlatinum.getDefaultState(), 4);
        }
        if(InitBlocks.registerPlutonium)
        {
            this.plutoniumOre = new EXOreWorldGenMinable(InitBlocks.blockOrePlutonium.getDefaultState(),4);
        }
        if(InitBlocks.registerPolonium)
        {
            this.poloniumOre = new EXOreWorldGenMinable(InitBlocks.blockOrePolonium.getDefaultState(), 4);
        }
        if(InitBlocks.registerPromethium)
        {
            this.promethiumOre = new EXOreWorldGenMinable(InitBlocks.blockOrePromethium.getDefaultState(),4);
        }
        if(InitBlocks.registerQuartz)
        {
            this.quartzOre = new EXOreWorldGenMinable(InitBlocks.blockOreQuartz.getDefaultState(),4);
        }
        if(InitBlocks.registerRhenium)
        {
            this.rheniumOre = new EXOreWorldGenMinable(InitBlocks.blockOreRhenium.getDefaultState(), 4);
        }
        if(InitBlocks.registerRhodium)
        {
            this.rhodiumOre = new EXOreWorldGenMinable(InitBlocks.blockOreRhodium.getDefaultState(), 4);
        }
        if(InitBlocks.registerRubracium)
        {
            this.rubraciumOre = new EXOreWorldGenMinable(InitBlocks.blockOreRubracium.getDefaultState(),4);
        }
        if(InitBlocks.registerRuby)
        {
            this.rubyOre = new EXOreWorldGenMinable(InitBlocks.blockOreRuby.getDefaultState(), 4);
        }
        if(InitBlocks.registerRuthenium)
        {
            this.rutheniumOre = new EXOreWorldGenMinable(InitBlocks.blockOreRuthenium.getDefaultState(), 4);
        }
        if(InitBlocks.registerSanguinite)
        {
            this.sanguiniteOre = new EXOreWorldGenMinable(InitBlocks.blockOreSanguinite.getDefaultState(),4,new NetherPredicate());
        }
        if(InitBlocks.registerSapphire)
        {
            this.sapphireOre = new EXOreWorldGenMinable(InitBlocks.blockOreSapphire.getDefaultState(), 4);
        }
        if(InitBlocks.registerShadowIron)
        {
            this.shadowIronOre = new EXOreWorldGenMinable(InitBlocks.blockOreShadowIron.getDefaultState(),4,new NetherPredicate());
        }
        if(InitBlocks.registerSilver)
        {
            this.silverOre = new EXOreWorldGenMinable(InitBlocks.blockOreSilver.getDefaultState(), 4);
        }
        if(InitBlocks.registerSpinel)
        {
            this.spinelOre = new EXOreWorldGenMinable(InitBlocks.blockOreSpinel.getDefaultState(), 4);
        }
        if(InitBlocks.registerSugilite)
        {
            this.sugiliteOre = new EXOreWorldGenMinable(InitBlocks.blockOreSugilite.getDefaultState(), 4);
        }
        if(InitBlocks.registerTantalum)
        {
            this.tantalumOre = new EXOreWorldGenMinable(InitBlocks.blockOreTantalum.getDefaultState(), 4);
        }
        if(InitBlocks.registerTanzanite)
        {
            this.tanzaniteOre = new EXOreWorldGenMinable(InitBlocks.blockOreTanzanite.getDefaultState(), 4);
        }
        if(InitBlocks.registerTartarite)
        {
            this.tartariteOre = new EXOreWorldGenMinable(InitBlocks.blockOreTartarite.getDefaultState(),4);
        }
        if(InitBlocks.registerTechnetium)
        {
            this.technetiumOre = new EXOreWorldGenMinable(InitBlocks.blockOreTechnetium.getDefaultState(), 4);
        }
        if(InitBlocks.registerThallium)
        {
            this.thalliumOre = new EXOreWorldGenMinable(InitBlocks.blockOreThallium.getDefaultState(), 4);
        }
        if(InitBlocks.registerTin)
        {
            this.tinOre = new EXOreWorldGenMinable(InitBlocks.blockOreTin.getDefaultState(), 4);
        }
        if(InitBlocks.registerTitanium)
        {
            this.titaniumOre = new EXOreWorldGenMinable(InitBlocks.blockOreTitanium.getDefaultState(), 4);
        }
        if(InitBlocks.registerTopaz)
        {
            this.topazOre = new EXOreWorldGenMinable(InitBlocks.blockOreTopaz.getDefaultState(), 4);
        }
        if(InitBlocks.registerTourmaline)
        {
            this.tourmalineOre = new EXOreWorldGenMinable(InitBlocks.blockOreTourmaline.getDefaultState(), 4);
        }
        if(InitBlocks.registerTungsten)
        {
            this.tungstenOre = new EXOreWorldGenMinable(InitBlocks.blockOreTungsten.getDefaultState(), 4);
        }
        if(InitBlocks.registerTurquoise)
        {
            this.turquoiseOre = new EXOreWorldGenMinable(InitBlocks.blockOreTurquoise.getDefaultState(), 4);
        }
        if(InitBlocks.registerUnobtainium)
        {
            this.unobtainiumOre = new EXOreWorldGenMinable(InitBlocks.blockOreUnobtainium.getDefaultState(), 4);
        }
        if(InitBlocks.registerUranium)
        {
            this.uraniumOre = new EXOreWorldGenMinable(InitBlocks.blockOreUranium.getDefaultState(),4);
        }
        if(InitBlocks.registerVanadium)
        {
            this.vanadiumOre = new EXOreWorldGenMinable(InitBlocks.blockOreVanadium.getDefaultState(), 4);
        }
        if(InitBlocks.registerVulcanite)
        {
            this.vulcaniteOre = new EXOreWorldGenMinable(InitBlocks.blockOreVulcanite.getDefaultState(),4,new NetherPredicate());
        }
        if(InitBlocks.registerVyroxeres)
        {
            this.vyroxeresOre = new EXOreWorldGenMinable(InitBlocks.blockOreVyroxeres.getDefaultState(),4,new NetherPredicate());
        }
        if(InitBlocks.registerYellorite)
        {
            this.yelloriteOre = new EXOreWorldGenMinable(InitBlocks.blockOreYellorite.getDefaultState(), 4);
        }
        if(InitBlocks.registerZinc)
        {
            this.zincOre = new EXOreWorldGenMinable(InitBlocks.blockOreZinc.getDefaultState(), 4);
        }
        if(InitBlocks.registerZirconium)
        {
            this.zirconiumOre = new EXOreWorldGenMinable(InitBlocks.blockOreZirconium.getDefaultState(), 4);
        }
    }
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        if(world.provider.getDimensionType().getName().equalsIgnoreCase("Overworld") || world.provider.getDimensionType().getName().equalsIgnoreCase("Deep Dark") || world.provider.getDimensionType().getName().equalsIgnoreCase("rftools_dimension"))
        {
            if(InitBlocks.registerAdamantine)
            {
                runGenerator(this.adamantineOre,world,random,chunkX,chunkZ,20,0,32);
            }
            if(InitBlocks.registerAgate)
            {
                runGenerator(this.agateOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerAluminum)
            {
                runGenerator(this.aluminumOre, world, random, chunkX, chunkZ, 20, 0, 100);
            }
            if(InitBlocks.registerAmericium)
            {
                runGenerator(this.americiumOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerAmethyst)
            {
                runGenerator(this.amethystOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerAmetrine)
            {
                runGenerator(this.ametrineOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerAmordrine)
            {
                runGenerator(this.amordrineOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerAngmallen)
            {
                runGenerator(this.angmallenOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerAquamarine)
            {
                runGenerator(this.aquamarineOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerAstralSilver)
            {
                runGenerator(this.astralSilverOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerAtlarus)
            {
                runGenerator(this.atlarusOre,world,random,chunkX,chunkZ,20,0,32);
            }
            if(InitBlocks.registerBismuth)
            {
                runGenerator(this.bismuthOre, world, random, chunkX, chunkZ, 20, 0, 100);
            }
            if(InitBlocks.registerBlackSteel)
            {
                runGenerator(this.blackSteelOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerCadmium)
            {
                runGenerator(this.cadmiumOre, world, random, chunkX, chunkZ, 20, 0, 100);
            }
            if(InitBlocks.registerCarmot)
            {
                runGenerator(this.carmotOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerCelenegil)
            {
                runGenerator(this.celenegilOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerChromium)
            {
                runGenerator(this.chromiumOre, world, random, chunkX, chunkZ, 20, 0, 100);
            }
            if(InitBlocks.registerChrysocolla)
            {
                runGenerator(this.chrysocollaOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerCitrine)
            {
                runGenerator(this.citrineOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerCobalt)
            {
                runGenerator(this.cobaltOre, world, random, chunkX, chunkZ, 20, 0, 100);
            }
            if(InitBlocks.registerCopper)
            {
                runGenerator(this.copperOre, world, random, chunkX, chunkZ, 20, 0, 100);
            }
            if(InitBlocks.registerDeepIron)
            {
                runGenerator(this.deepIronOre,world,random,chunkX,chunkZ,20,0,32);
            }
            if(InitBlocks.registerDesichalkos)
            {
                runGenerator(this.desichalkosOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerEximite)
            {
                runGenerator(this.eximiteOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerGallium)
            {
                runGenerator(this.galliumOre, world, random, chunkX, chunkZ, 20, 0, 100);
            }
            if(InitBlocks.registerGarnet)
            {
                runGenerator(this.garnetOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerHaderoth)
            {
                runGenerator(this.haderothOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerHepatizon)
            {
                runGenerator(this.hepatizonOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerIndium)
            {
                runGenerator(this.indiumOre, world, random, chunkX, chunkZ, 20, 0, 100);
            }
            if(InitBlocks.registerInfuscolium)
            {
                runGenerator(this.infuscoliumOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerInolashite)
            {
                runGenerator(this.inolashiteOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerIolite)
            {
                runGenerator(this.ioliteOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerIridium)
            {
                runGenerator(this.iridiumOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerJade)
            {
                runGenerator(this.jadeOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerJasper)
            {
                runGenerator(this.jasperOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerKyanite)
            {
                runGenerator(this.kyaniteOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerLead)
            {
                runGenerator(this.leadOre, world, random, chunkX, chunkZ, 20, 0, 100);
            }
            if(InitBlocks.registerMalachite)
            {
                runGenerator(this.malachiteOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerManganese)
            {
                runGenerator(this.manganeseOre, world, random, chunkX, chunkZ, 20, 0, 100);
            }
            if(InitBlocks.registerMeutoite)
            {
                runGenerator(this.meutoiteOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerMithril)
            {
                runGenerator(this.mithrilOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerMolybdenum)
            {
                runGenerator(this.molybdenumOre, world, random, chunkX, chunkZ, 20, 0, 100);
            }
            if(InitBlocks.registerNeodymium)
            {
                runGenerator(this.neodymiumOre, world, random, chunkX, chunkZ, 20, 0, 100);
            }
            if(InitBlocks.registerNeptunium)
            {
                runGenerator(this.neptuniumOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerNickel)
            {
                runGenerator(this.nickelOre, world, random, chunkX, chunkZ, 20, 0, 100);
            }
            if(InitBlocks.registerNiobium)
            {
                runGenerator(this.niobiumOre, world, random, chunkX, chunkZ, 20, 0, 100);
            }
            if(InitBlocks.registerOnyx)
            {
                runGenerator(this.onyxOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerOpal)
            {
                runGenerator(this.opalOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerOrichalcum)
            {
                runGenerator(this.orichalcumOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerOsmium)
            {
                runGenerator(this.osmiumOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerOureclase)
            {
                runGenerator(this.oureclaseOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerPalladium)
            {
                runGenerator(this.palladiumOre, world, random, chunkX, chunkZ, 20, 0, 100);
            }
            if(InitBlocks.registerPeridot)
            {
                runGenerator(this.peridotOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerPhoenixite)
            {
                runGenerator(this.phoenixiteOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerPlatinum)
            {
                runGenerator(this.platinumOre, world, random, chunkX, chunkZ, 20, 0, 100);
            }
            if(InitBlocks.registerPlutonium)
            {
                runGenerator(this.plutoniumOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerPolonium)
            {
                runGenerator(this.poloniumOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerPromethium)
            {
                runGenerator(this.promethiumOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerQuartz)
            {
                runGenerator(this.quartzOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerRhenium)
            {
                runGenerator(this.rheniumOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerRhodium)
            {
                runGenerator(this.rhodiumOre, world, random, chunkX, chunkZ, 20, 0, 100);
            }
            if(InitBlocks.registerRubracium)
            {
                runGenerator(this.rubraciumOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerRuby)
            {
                runGenerator(this.rubyOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerRuthenium)
            {
                runGenerator(this.rutheniumOre, world, random, chunkX, chunkZ, 20, 0, 100);
            }
            if(InitBlocks.registerSapphire)
            {
                runGenerator(this.sapphireOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerSilver)
            {
                runGenerator(this.silverOre, world, random, chunkX, chunkZ, 20, 0, 100);
            }
            if(InitBlocks.registerSpinel)
            {
                runGenerator(this.spinelOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerSugilite)
            {
                runGenerator(this.sugiliteOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerTantalum)
            {
                runGenerator(this.tantalumOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerTanzanite)
            {
                runGenerator(this.tanzaniteOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerTartarite)
            {
                runGenerator(this.tartariteOre,world,random,chunkX,chunkZ,20,0,32);
            }
            if(InitBlocks.registerTechnetium)
            {
                runGenerator(this.technetiumOre, world, random, chunkX, chunkZ, 20, 0, 100);
            }
            if(InitBlocks.registerThallium)
            {
                runGenerator(this.thalliumOre, world, random, chunkX, chunkZ, 20, 0, 100);
            }
            if(InitBlocks.registerTin)
            {
                runGenerator(this.tinOre, world, random, chunkX, chunkZ, 20, 0, 100);
            }
            if(InitBlocks.registerTitanium)
            {
                runGenerator(this.titaniumOre, world, random, chunkX, chunkZ, 20, 0, 100);
            }
            if(InitBlocks.registerTopaz)
            {
                runGenerator(this.topazOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerTourmaline)
            {
                runGenerator(this.tourmalineOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerTungsten)
            {
                runGenerator(this.tungstenOre, world, random, chunkX, chunkZ, 20, 0, 100);
            }
            if(InitBlocks.registerTurquoise)
            {
                runGenerator(this.turquoiseOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerUnobtainium)
            {
                runGenerator(this.unobtainiumOre, world, random, chunkX, chunkZ, 20, 0, 100);
            }
            if(InitBlocks.registerUranium)
            {
                runGenerator(this.uraniumOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerVanadium)
            {
                runGenerator(this.vanadiumOre, world, random, chunkX, chunkZ, 20, 0, 100);
            }
            if(InitBlocks.registerYellorite)
            {
                runGenerator(this.yelloriteOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerZinc)
            {
                runGenerator(this.zincOre, world, random, chunkX, chunkZ, 20, 0, 100);
            }
            if(InitBlocks.registerZirconium)
            {
                runGenerator(this.zirconiumOre, world, random, chunkX, chunkZ, 20, 0, 100);
            }
        }
        else if (world.provider.getDimensionType().getName().equalsIgnoreCase("the_nether"))
        {
            if(InitBlocks.registerAldourite)
            {
                runGenerator(this.aldouriteOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerCeruclase)
            {
                runGenerator(this.ceruclaseOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerIgnatius)
            {
                runGenerator(this.ignatiusOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerKalendrite)
            {
                runGenerator(this.kalendriteOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerLemurite)
            {
                runGenerator(this.lemuriteOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerMidasium)
            {
                runGenerator(this.midasiumOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerSanguinite)
            {
                runGenerator(this.sanguiniteOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerShadowIron)
            {
                runGenerator(this.shadowIronOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerVulcanite)
            {
                runGenerator(this.vulcaniteOre,world,random,chunkX,chunkZ,20,0,100);
            }
            if(InitBlocks.registerVyroxeres)
            {
                runGenerator(this.vyroxeresOre,world,random,chunkX,chunkZ,20,0,100);
            }
        }
    }
    public void runGenerator(WorldGenerator generator,World world,Random rand,int chunkX,int chunkZ,int chanceToSpawn,int minHeight,int maxHeight)
    {
        if(minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
        {
            throw new IllegalArgumentException("Minimum or Maximum height out of bounds");
        }
        int heightDiff = maxHeight - minHeight + 1;
        for(int i = 0; i < chanceToSpawn; i++)
        {
            int x = chunkX * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunkZ * 16 + rand.nextInt(16);
            BlockPos pos = new BlockPos(x,y,z);
            generator.generate(world,rand,pos);
        }
    }
}
