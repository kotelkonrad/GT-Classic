package gtclassic;

import java.awt.Color;

import gtclassic.item.GTItemChainsaw;
import gtclassic.item.GTItemComponents;
import gtclassic.item.GTItemCraftingTablet;
import gtclassic.item.GTItemCreativeScanner;
import gtclassic.item.GTItemDestructoPack;
import gtclassic.item.GTItemDrill;
import gtclassic.item.GTItemDuctTape;
import gtclassic.item.GTItemEchophone;
import gtclassic.item.GTItemElectromagnet;
import gtclassic.item.GTItemFile;
import gtclassic.item.GTItemHammer;
import gtclassic.item.GTItemRockCutter;
import gtclassic.item.GTItemSurvivalScanner;
import gtclassic.item.GTItemTeslaStaff;
import gtclassic.item.materials.GTItemDust;
import gtclassic.item.materials.GTItemDustSmall;
import gtclassic.item.materials.GTItemElement;
import gtclassic.item.materials.GTItemGem;
import gtclassic.item.materials.GTItemIngot;
import gtclassic.item.materials.GTItemNugget;
import gtclassic.item.materials.GTItemPlasma;
import gtclassic.item.materials.GTItemPlate;
import gtclassic.item.materials.GTItemStick;
import gtclassic.util.GTBatteryBuilder;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class GTItems {

	public static final GTItemElement hydrogen = new GTItemElement("Hyrdogen", Color.blue),
			dueterium = new GTItemElement("Dueterium", Color.yellow),
			tritium = new GTItemElement("Tritium", Color.red),
			helium = new GTItemElement("Helium", Color.yellow),
			lithium = new GTItemElement("Lithium", Color.lightGray),
			helium3 = new GTItemElement("Helium3", Color.yellow),
			silicon = new GTItemElement("Silicon", Color.black),
			carbon = new GTItemElement("Carbon", Color.black),
			methane = new GTItemElement("Methane", Color.pink),
			berilium = new GTItemElement("Berilium", Color.green),
			calcium = new GTItemElement("Calacium", Color.white),
			sodium = new GTItemElement("Sodium", Color.blue),
			chlorine = new GTItemElement("Chlorine", Color.cyan),
			potassium = new GTItemElement("Potassium", Color.white),
			nitrogen = new GTItemElement("Nitrogen", Color.white),
			oxygen = new GTItemElement("Oxygen", Color.white),
			glassTube = new GTItemElement("Empty", Color.white);

	public static final GTItemPlasma plasmaHydrogen = new GTItemPlasma("Hyrdogen", Color.blue),
			plasmaNitrogen = new GTItemPlasma("Nitrogen", Color.white),
			plasmaOxygen = new GTItemPlasma("Oxygen", Color.white),
			plasmaHelium = new GTItemPlasma("Helium", Color.yellow),
			plasmaIron = new GTItemPlasma("Iron", Color.red);

	public static final GTItemDust dustAlmandine = new GTItemDust("Almandine"),
			dustAluminium = new GTItemDust("Aluminium"),
			dustAndradite = new GTItemDust("Andradite"),
			dustAshes = new GTItemDust("Ashes"),
			dustBasalt = new GTItemDust("Basalt"),
			dustBauxite = new GTItemDust("Bauxite"),
			dustBrass = new GTItemDust("Brass"),
			dustCalcite = new GTItemDust("Calcite"),
			dustChrome = new GTItemDust("Chrome"),
			dustCinnabar = new GTItemDust("Cinnabar"),
			dustDarkAshes = new GTItemDust("DarkAshes"),
			dustDiamond = new GTItemDust("Diamond"),
			dustElectrum = new GTItemDust("Electrum"),
			dustEmerald = new GTItemDust("Emerald"),
			dustEnderEye = new GTItemDust("EnderEye"),
			dustEnderpearl = new GTItemDust("Enderpearl"),
			dustEndstone = new GTItemDust("Endstone"),
			dustFlint = new GTItemDust("Flint"),
			dustGalena = new GTItemDust("Galena"),
			dustGreenSapphire = new GTItemDust("GreenSapphire"),
			dustGrossular = new GTItemDust("Grossular"),
			dustInvar = new GTItemDust("Invar"),
			dustLazurite = new GTItemDust("Lazurite"),
			dustLead = new GTItemDust("Lead"),
			dustMagnesium = new GTItemDust("Magnesium"),
			dustManganese = new GTItemDust("Manganese"),
			dustMarble = new GTItemDust("Marble"),
			dustNickel = new GTItemDust("Nickel"),
			dustOlivine = new GTItemDust("Olivine"),
			dustOsmium = new GTItemDust("Osmium"),
			dustPhosphor = new GTItemDust("Phosphor"),
			dustPlastic = new GTItemDust("Plastic"),
			dustPlatinum = new GTItemDust("Platinum"),
			dustPlutonium = new GTItemDust("Plutonium"),
			dustPyrite = new GTItemDust("Pyrite"),
			dustPyrope = new GTItemDust("Pyrope"),
			dustRedGarnet = new GTItemDust("RedGarnet"),
			dustRedRock = new GTItemDust("RedRock"),
			dustRuby = new GTItemDust("Ruby"),
			dustSaltpeter = new GTItemDust("Saltpeter"),
			dustSapphire = new GTItemDust("Sapphire"),
			dustSodalite = new GTItemDust("Sodalite"),
			dustSpessartine = new GTItemDust("Spessartine"),
			dustSphalerite = new GTItemDust("Sphalerite"),
			dustSteel = new GTItemDust("Steel"),
			dustSulfur = new GTItemDust("Sulfur"),
			dustThorium = new GTItemDust("Thorium"),
			dustTitanium = new GTItemDust("Titanium"),
			dustTungsten = new GTItemDust("Tungsten"),
			dustUranium = new GTItemDust("Uranium"),
			dustUvarovite = new GTItemDust("Uvarovite"),
			dustWoodPulp = new GTItemDust("Wood"),
			dustYellowGarnet = new GTItemDust("YellowGarnet"),
			dustZinc = new GTItemDust("Zinc");

	public static final GTItemDustSmall smallDustAlmandine = new GTItemDustSmall("Almandine"),
			smallDustAluminum = new GTItemDustSmall("Aluminium"),
			smallDustAndradite = new GTItemDustSmall("Andradite"),
			smallDustAshes = new GTItemDustSmall("Ashes"),
			smallDustBasalt = new GTItemDustSmall("Basalt"),
			smallDustBauxite = new GTItemDustSmall("Bauxite"),
			smallDustBrass = new GTItemDustSmall("Brass"),
			smallDustBronze = new GTItemDustSmall("Bronze"),
			smallDustCalcite = new GTItemDustSmall("Calcite"),
			smallDustCharcoal = new GTItemDustSmall("Charcoal"),
			smallDustChrome = new GTItemDustSmall("Chrome"),
			smallDustCinnabar = new GTItemDustSmall("Cinnabar"),
			smallDustClay = new GTItemDustSmall("Clay"),
			smallDustCoal = new GTItemDustSmall("Coal"),
			smallDustCopper = new GTItemDustSmall("Copper"),
			smallDustDarkAshes = new GTItemDustSmall("DarkAshes"),
			smallDustDiamond = new GTItemDustSmall("Diamond"),
			smallDustElectrum = new GTItemDustSmall("Electrum"),
			smallDustEmerald = new GTItemDustSmall("Emerald"),
			smallDustEnderEye = new GTItemDustSmall("EnderEye"),
			smallDustEnderpearl = new GTItemDustSmall("Enderpearl"),
			smallDustEndstone = new GTItemDustSmall("Endstone"),
			smallDustFlint = new GTItemDustSmall("Flint"),
			smallDustGalena = new GTItemDustSmall("Galena"),
			smallDustGlowstone = new GTItemDustSmall("Glowstone"),
			smallDustGold = new GTItemDustSmall("Gold"),
			smallDustGreenSapphire = new GTItemDustSmall("GreenSapphire"),
			smallDustGrossular = new GTItemDustSmall("Grossular"),
			smallDustGunpowder = new GTItemDustSmall("Gunpowder"),
			smallDustInvar = new GTItemDustSmall("Invar"),
			smallDustIron = new GTItemDustSmall("Iron"),
			smallDustLazurite = new GTItemDustSmall("Lazurite"),
			smallDustLead = new GTItemDustSmall("Lead"),
			smallDustMagnesium = new GTItemDustSmall("Magnesium"),
			smallDustManganese = new GTItemDustSmall("Manganese"),
			smallDustMarble = new GTItemDustSmall("Marble"),
			smallDustNetherrack = new GTItemDustSmall("Netherrack"),
			smallDustNickel = new GTItemDustSmall("Nickel"),
			smallDustObsidian = new GTItemDustSmall("Obsidian"),
			smallDustOlivine = new GTItemDustSmall("Olivine"),
			smallDustOsmium = new GTItemDustSmall("Osmium"),
			smallDustPhosphor = new GTItemDustSmall("Phosphor"),
			smallDustPlatinum = new GTItemDustSmall("Platinum"),
			smallDustPlutonium = new GTItemDustSmall("Plutonium"),
			smallDustPyrite = new GTItemDustSmall("Pyrite"),
			smallDustPyrope = new GTItemDustSmall("Pyrope"),
			smallDustRedGarnet = new GTItemDustSmall("RedGarnet"),
			smallDustRedRock = new GTItemDustSmall("RedRock"),
			smallDustRedstone = new GTItemDustSmall("Redstone"),
			smallDustRuby = new GTItemDustSmall("Ruby"),
			smallDustSaltpeter = new GTItemDustSmall("Saltpeter"),
			smallDustSapphire = new GTItemDustSmall("Sapphire"),
			smallDustSilver = new GTItemDustSmall("Silver"),
			smallDustSodalite = new GTItemDustSmall("Sodalite"),
			smallDustSpessartine = new GTItemDustSmall("Spessartine"),
			smallDustSphalerite = new GTItemDustSmall("Sphalerite"),
			smallDustSteel = new GTItemDustSmall("Steel"),
			smallDustSulfur = new GTItemDustSmall("Sulfur"),
			smallDustThorium = new GTItemDustSmall("Thorium"),
			smallDustTin = new GTItemDustSmall("Tin"),
			smallDustTitanium = new GTItemDustSmall("Titanium"),
			smallDustTungsten = new GTItemDustSmall("Tungsten"),
			smallDustUranium = new GTItemDustSmall("Uranium"),
			smallDustUvarovite = new GTItemDustSmall("Uvarovite"),
			smallDustWoodPulp = new GTItemDustSmall("Wood"),
			smallDustYellowGarnet = new GTItemDustSmall("YellowGarnet"),
			smallDustZinc = new GTItemDustSmall("Zinc");

	public static final GTItemGem gemRedGarnet = new GTItemGem("RedGarnet"),
			gemYellowGarnet = new GTItemGem("YellowGarnet"),
			gemOlivine = new GTItemGem("Olivine"),
			gemRuby = new GTItemGem("Ruby"),
			gemSapphire = new GTItemGem("Sapphire"),
			gemGreenSapphire = new GTItemGem("GreenSapphire");

	public static final GTItemIngot ingotAluminium = new GTItemIngot("Aluminium"),
			ingotBrass = new GTItemIngot("Brass"),
			ingotChrome = new GTItemIngot("Chrome"),
			ingotElectrum = new GTItemIngot("Electrum"),
			ingotInvar = new GTItemIngot("Invar"),
			ingotIridium = new GTItemIngot("Iridium"),
			ingotLead = new GTItemIngot("Lead"),
			ingotMagnalium = new GTItemIngot("Magnalium"),
			ingotNickel = new GTItemIngot("Nickel"),
			ingotOsmium = new GTItemIngot("Osmium"),
			ingotPlatinum = new GTItemIngot("Platinum"),
			ingotPlutonium = new GTItemIngot("Plutonium"),
			ingotSteel = new GTItemIngot("Steel"),
			ingotThorium = new GTItemIngot("Thorium"),
			ingotTitanium = new GTItemIngot("Titanium"),
			ingotTungsten = new GTItemIngot("Tungsten"),
			ingotTungstensteel = new GTItemIngot("TungstenSteel"),
			ingotZinc = new GTItemIngot("Zinc");

	public static final GTItemPlate plateAluminum = new GTItemPlate("Aluminium"),
			plateBrass = new GTItemPlate("Brass"),
			plateBronze = new GTItemPlate("Bronze"),
			plateChrome = new GTItemPlate("Chrome"),
			plateCopper = new GTItemPlate("Copper"),
			plateElectrum = new GTItemPlate("Electrum"),
			plateGold = new GTItemPlate("Gold"),
			plateInvar = new GTItemPlate("Invar"),
			plateIron = new GTItemPlate("Iron"),
			plateLead = new GTItemPlate("Lead"),
			plateMagnalium = new GTItemPlate("Magnalium"),
			plateNickel = new GTItemPlate("Nickel"),
			plateOsmium = new GTItemPlate("Osmium"),
			platePlatinum = new GTItemPlate("Platinum"),
			platePlutonium = new GTItemPlate("Plutonium"),
			plateRefinedIron = new GTItemPlate("RefinedIron"),
			plateSilicon = new GTItemPlate("Silicon"),
			plateSilver = new GTItemPlate("Silver"),
			plateSteel = new GTItemPlate("Steel"),
			plateTin = new GTItemPlate("Tin"),
			plateTitanium = new GTItemPlate("Titanium"),
			plateTungsten = new GTItemPlate("Tungsten"),
			plateTungstensteel = new GTItemPlate("TungstenSteel"),
			plateZinc = new GTItemPlate("Zinc");

	public static final GTItemStick stickAluminium = new GTItemStick("Aluminium"),
			stickBrass = new GTItemStick("Brass"),
			stickBronze = new GTItemStick("Bronze"),
			stickChrome = new GTItemStick("Chrome"),
			stickCopper = new GTItemStick("Copper"),
			stickElectrum = new GTItemStick("Electrum"),
			stickInvar = new GTItemStick("Invar"),
			stickIridium = new GTItemStick("Iridium"),
			stickIron = new GTItemStick("Iron"),
			stickLead = new GTItemStick("Lead"),
			stickNickel = new GTItemStick("Nickel"),
			stickOsmium = new GTItemStick("Osmium"),
			stickPlatinum = new GTItemStick("Platinum"),
			stickSilver = new GTItemStick("Silver"),
			stickSteel = new GTItemStick("Steel"),
			stickTin = new GTItemStick("Tin"),
			stickTitanium = new GTItemStick("Titanium"),
			stickTungsten = new GTItemStick("Tungsten"),
			stickZinc = new GTItemStick("Zinc");

	public static final GTItemNugget nuggetAluminium = new GTItemNugget("Aluminium"),
			nuggetBrass = new GTItemNugget("Brass"),
			nuggetBronze = new GTItemNugget("Bronze"),
			nuggetChrome = new GTItemNugget("Chrome"),
			nuggetCopper = new GTItemNugget("Copper"),
			nuggetElectrum = new GTItemNugget("Electrum"),
			nuggetInvar = new GTItemNugget("Invar"),
			nuggetIridium = new GTItemNugget("Iridium"),
			nuggetLead = new GTItemNugget("Lead"),
			nuggetNickel = new GTItemNugget("Nickel"),
			nuggetOsmium = new GTItemNugget("Osmium"),
			nuggetPlatinum = new GTItemNugget("Platinum"),
			nuggetPlutonium = new GTItemNugget("Plutonium"),
			nuggetSilver = new GTItemNugget("Silver"),
			nuggetSteel = new GTItemNugget("Steel"),
			nuggetTin = new GTItemNugget("Tin"),
			nuggetThorium = new GTItemNugget("Thorium"),
			nuggetTitanium = new GTItemNugget("Titanium"),
			nuggetTungsten = new GTItemNugget("Tungsten"),
			nuggetTungstenSteel = new GTItemNugget("TungstenSteel"),
			nuggetZinc = new GTItemNugget("Zinc");

	public static final GTItemComponents bouleSilicon = new GTItemComponents("bouleSilicon", 32, false),
			platePlastic = new GTItemComponents("platePlastic", 34, false),
			lensDiamond = new GTItemComponents("lensDiamond", 35, true),
			lensRuby = new GTItemComponents("lensRuby", 36, true),
			lensEmerald = new GTItemComponents("lensEmerald", 37, true),
			lensSapphire = new GTItemComponents("lensSapphire", 38, true),
			chipDiamond = new GTItemComponents("chipDiamond", 39, false),
			chipRuby = new GTItemComponents("chipRuby", 40, false),
			chipEmerald = new GTItemComponents("chipEmerald", 41, false),
			chipSapphire = new GTItemComponents("chipSapphire", 42, false),
			circuitEmpty = new GTItemComponents("circuitEmpty", 43, false),
			circuitDiamond = new GTItemComponents("circuitDiamond", 44, false),
			circuitRuby = new GTItemComponents("circuitRuby", 45, false),
			circuitEmerald = new GTItemComponents("circuitEmerald", 46, false),
			circuitSapphire = new GTItemComponents("circutSapphire", 47, false);

	public static final GTItemDuctTape braintechAerospaceARDT = new GTItemDuctTape();
	public static final GTItemEchophone sonictronItem = new GTItemEchophone();
	public static final GTItemDestructoPack destructoPack = new GTItemDestructoPack();
	public static final GTItemCraftingTablet craftingTablet = new GTItemCraftingTablet();

	public static final GTItemFile fileIron = new GTItemFile("Iron", 256),
			fileAluminium = new GTItemFile("Aluminium", 128),
			fileTitanium = new GTItemFile("Titanium", 2560),
			fileTungstenSteel = new GTItemFile("TungstenSteel", 5120);

	public static final GTItemHammer hammerIron = new GTItemHammer("Iron", 6.0F, 256, 2),
			hammerAluminium = new GTItemHammer("Aluminium", 10.0F, 128, 2),
			hammerTitanium = new GTItemHammer("Titanium", 8.0F, 2560, 3),
			hammerTungstenSteel = new GTItemHammer("TungstenSteel", 10.0F, 5120, 4);

	public static final GTItemDrill advancedDrill = new GTItemDrill("Diamond", 32.0F, 100000, 128, 1);
	public static final GTItemDrill advancedDrill2 = new GTItemDrill("Diamond", 64.0F, 200000, 256, 2);
	public static final GTItemDrill advancedDrill3 = new GTItemDrill("Diamond", 128.0F, 400000, 512, 3);

	public static final GTItemChainsaw advancedChainsaw = new GTItemChainsaw("Steel", 12.0F, 100000, 128, 1);
	public static final GTItemChainsaw advancedChainsaw2 = new GTItemChainsaw("Steel", 24.0F, 200000, 256, 2);
	public static final GTItemChainsaw advancedChainsaw3 = new GTItemChainsaw("Steel", 48.0F, 400000, 512, 3);

	public static final GTItemRockCutter rockCutter = new GTItemRockCutter("Diamond", 1.0F, 10000, 100, 1);
	public static final GTItemRockCutter rockCutter2 = new GTItemRockCutter("Diamond", 2.0F, 100000, 256, 2);
	public static final GTItemRockCutter rockCutter3 = new GTItemRockCutter("Diamond", 4.0F, 1000000, 1024, 3);

	public static final GTItemElectromagnet electroMagnet = new GTItemElectromagnet();
	public static final GTItemTeslaStaff teslaStaff = new GTItemTeslaStaff();

	public static final GTItemCreativeScanner debugScanner = new GTItemCreativeScanner();
	public static final GTItemSurvivalScanner portableScanner = new GTItemSurvivalScanner();

	public static final GTBatteryBuilder smallLithium = new GTBatteryBuilder(GTBlocks.smallLithium, 100000, 128, 1),
			medLithium = new GTBatteryBuilder(GTBlocks.medLithium, 200000, 256, 2),
			largeLithium = new GTBatteryBuilder(GTBlocks.largeLithium, 400000, 512, 3),

			tinyEnergium = new GTBatteryBuilder(GTBlocks.tinyEnergium, 100000, 256, 2),
			smallEnergium = new GTBatteryBuilder(GTBlocks.smallEnergium, 1000000, 512, 3),
			medEnergium = new GTBatteryBuilder(GTBlocks.medEnergium, 10000000, 1024, 4),
			largeEnergium = new GTBatteryBuilder(GTBlocks.largeEnergium, 100000000, 4096, 5),
			hugeEnergium = new GTBatteryBuilder(GTBlocks.hugeEnergium, 1000000000, 8192, 6),

			tinyLapotron = new GTBatteryBuilder(GTBlocks.tinyLapotron, 1000000, 1024, 3),
			smallLapotron = new GTBatteryBuilder(GTBlocks.smallLapotron, 10000000, 4096, 4),
			medLapotron = new GTBatteryBuilder(GTBlocks.medLapotron, 100000000, 8192, 5),
			largeLapotron = new GTBatteryBuilder(GTBlocks.largeLapotron, 1000000000, 16384, 6),
			hugeLapotron = new GTBatteryBuilder(GTBlocks.hugeLapotron, Integer.MAX_VALUE, 32768, 7);

	public static final Item[] items = {

			hydrogen,
			dueterium,
			tritium,
			helium,
			lithium,
			helium3,
			silicon,
			carbon,
			methane,
			berilium,
			calcium,
			sodium,
			chlorine,
			potassium,
			nitrogen,
			oxygen,

			plasmaHydrogen,
			plasmaNitrogen,
			plasmaOxygen,
			plasmaHelium,
			plasmaIron,
			glassTube,

			dustAlmandine,
			dustAluminium,
			dustAndradite,
			dustAshes,
			dustBasalt,
			dustBauxite,
			dustBrass,
			dustCalcite,
			dustChrome,
			dustCinnabar,
			dustDarkAshes,
			dustDiamond,
			dustElectrum,
			dustEmerald,
			dustEnderEye,
			dustEnderpearl,
			dustEndstone,
			dustFlint,
			dustGalena,
			dustGreenSapphire,
			dustGrossular,
			dustInvar,
			dustLazurite,
			dustLead,
			dustMagnesium,
			dustManganese,
			dustMarble,
			dustNickel,
			dustOlivine,
			dustOsmium,
			dustPhosphor,
			dustPlastic,
			dustPlatinum,
			dustPlutonium,
			dustPyrite,
			dustPyrope,
			dustRedGarnet,
			dustRedRock,
			dustRuby,
			dustSaltpeter,
			dustSapphire,
			dustSodalite,
			dustSpessartine,
			dustSphalerite,
			dustSteel,
			dustSulfur,
			dustThorium,
			dustTitanium,
			dustTungsten,
			dustUranium,
			dustUvarovite,
			dustWoodPulp,
			dustYellowGarnet,
			dustZinc,

			smallDustAlmandine,
			smallDustAluminum,
			smallDustAndradite,
			smallDustAshes,
			smallDustBasalt,
			smallDustBauxite,
			smallDustBrass,
			smallDustBronze,
			smallDustCalcite,
			smallDustCharcoal,
			smallDustChrome,
			smallDustCinnabar,
			smallDustClay,
			smallDustCoal,
			smallDustCopper,
			smallDustDarkAshes,
			smallDustDiamond,
			smallDustElectrum,
			smallDustEmerald,
			smallDustEnderEye,
			smallDustEnderpearl,
			smallDustEndstone,
			smallDustFlint,
			smallDustGalena,
			smallDustGlowstone,
			smallDustGold,
			smallDustGreenSapphire,
			smallDustGrossular,
			smallDustGunpowder,
			smallDustInvar,
			smallDustIron,
			smallDustLazurite,
			smallDustLead,
			smallDustMagnesium,
			smallDustManganese,
			smallDustMarble,
			smallDustNetherrack,
			smallDustNickel,
			smallDustObsidian,
			smallDustOlivine,
			smallDustOsmium,
			smallDustPhosphor,
			smallDustPlatinum,
			smallDustPlutonium,
			smallDustPyrite,
			smallDustPyrope,
			smallDustRedGarnet,
			smallDustRedRock,
			smallDustRedstone,
			smallDustRuby,
			smallDustSaltpeter,
			smallDustSapphire,
			smallDustSilver,
			smallDustSodalite,
			smallDustSpessartine,
			smallDustSphalerite,
			smallDustSteel,
			smallDustSulfur,
			smallDustThorium,
			smallDustTin,
			smallDustTitanium,
			smallDustTungsten,
			smallDustUranium,
			smallDustUvarovite,
			smallDustWoodPulp,
			smallDustYellowGarnet,
			smallDustZinc,

			gemRedGarnet,
			gemYellowGarnet,
			gemOlivine,
			gemRuby,
			gemSapphire,
			gemGreenSapphire,

			ingotAluminium,
			ingotBrass,
			ingotChrome,
			ingotElectrum,
			ingotInvar,
			ingotIridium,
			ingotLead,
			ingotMagnalium,
			ingotNickel,
			ingotOsmium,
			ingotPlatinum,
			ingotPlutonium,
			ingotSteel,
			ingotThorium,
			ingotTitanium,
			ingotTungsten,
			ingotTungstensteel,
			ingotZinc,

			plateAluminum,
			plateBrass,
			plateBronze,
			plateChrome,
			plateCopper,
			plateElectrum,
			plateGold,
			plateInvar,
			plateIron,
			plateLead,
			plateMagnalium,
			plateNickel,
			plateOsmium,
			platePlatinum,
			platePlutonium,
			plateRefinedIron,
			plateSilicon,
			plateSilver,
			plateSteel,
			plateTin,
			plateTitanium,
			plateTungsten,
			plateTungstensteel,
			plateZinc,

			stickAluminium,
			stickBrass,
			stickBronze,
			stickChrome,
			stickCopper,
			stickElectrum,
			stickInvar,
			stickIridium,
			stickIron,
			stickLead,
			stickNickel,
			stickOsmium,
			stickPlatinum,
			stickSilver,
			stickSteel,
			stickTin,
			stickTitanium,
			stickTungsten,
			stickZinc,

			nuggetAluminium,
			nuggetBrass,
			nuggetBronze,
			nuggetChrome,
			nuggetCopper,
			nuggetElectrum,
			nuggetInvar,
			nuggetIridium,
			nuggetLead,
			nuggetNickel,
			nuggetOsmium,
			nuggetPlatinum,
			nuggetPlutonium,
			nuggetSilver,
			nuggetSteel,
			nuggetTin,
			nuggetThorium,
			nuggetTitanium,
			nuggetTungsten,
			nuggetTungstenSteel,
			nuggetZinc,

			bouleSilicon,
			platePlastic,
			lensDiamond,
			lensRuby,
			lensEmerald,
			lensSapphire,
			chipDiamond,
			chipRuby,
			chipEmerald,
			chipSapphire,
			circuitEmpty,
			circuitDiamond,
			circuitRuby,
			circuitEmerald,
			circuitSapphire,

			fileIron,
			fileAluminium,
			fileTitanium,
			fileTungstenSteel,

			hammerIron,
			hammerAluminium,
			hammerTitanium,
			hammerTungstenSteel,

			advancedDrill,
			advancedDrill2,
			advancedDrill3,

			advancedChainsaw,
			advancedChainsaw2,
			advancedChainsaw3,

			rockCutter,
			rockCutter2,
			rockCutter3,

			destructoPack,
			craftingTablet,
			braintechAerospaceARDT,
			sonictronItem,
			electroMagnet,
			teslaStaff,
			portableScanner,
			debugScanner,

			smallLithium,
			medLithium,
			largeLithium,

			tinyLapotron,
			smallLapotron,
			medLapotron,
			largeLapotron,
			hugeLapotron,

			tinyEnergium,
			smallEnergium,
			medEnergium,
			largeEnergium,
			hugeEnergium,

	};

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		IForgeRegistry<Item> registry = event.getRegistry();
		GTMod.logger.info("Registering Items");
		for (Item item : items) {
			registry.register(item);
		}
	}

}
