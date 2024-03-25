package hyperdefined.darkgemsrb;


//Custom Classes

import hyperdefined.darkgemsrb.blocks.darkblock;
import hyperdefined.darkgemsrb.generation.oreGenerationClass;
import hyperdefined.darkgemsrb.items.bluegem;
import hyperdefined.darkgemsrb.items.blueshard;
import hyperdefined.darkgemsrb.items.darkgem;
import hyperdefined.darkgemsrb.items.greengem;
import hyperdefined.darkgemsrb.items.greenshard;
import hyperdefined.darkgemsrb.items.infusedgem;
import hyperdefined.darkgemsrb.items.magicalgem;
import hyperdefined.darkgemsrb.proxy.ProxyCommon;
import hyperdefined.darkgemsrb.proxy.ProxyClient;
import hyperdefined.darkgemsrb.tools.DarkAxe;
import hyperdefined.darkgemsrb.tools.DarkPickaxe;
import hyperdefined.darkgemsrb.tools.DarkSpade;
import hyperdefined.darkgemsrb.tools.DarkSword;
import hyperdefined.darkgemsrb.blocks.darkOre;


//Forge Stuff
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.util.EnumHelper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.launchwrapper.Launch;

///////////////////////////////////////////////////////////////////

@Mod(modid = mainClass.MODID, version = mainClass.VERSION)
	public class mainClass
	{
    public static final String MODID = "darkgemsrb";
    public static final String VERSION = "1.2.2-B";
    @Instance(value = MODID)
    public static mainClass instance;
    
    
    
    public static final Logger LOGGER = LogManager.getLogger("[DarkGemsReborn]");{
        LOGGER.info("Running 1.3-BETA");
    }
    
    //Proxy
    @SidedProxy(clientSide = "hyperdefined.darkgemsrb.proxy.ProxyClient" , serverSide = "hyperdefined.darkgemsrb.proxy.ProxyCommon")
    public static ProxyCommon proxy;
    
    //Init Things// 
    	
    //Blocks
    public static Block darkblock;
    public static Block darkOre;
    //Armor Materials
    public static ArmorMaterial gemarmor = EnumHelper.addArmorMaterial("gem", 20, new int[] {3, 8, 6, 3,}, 9);  	
    //Tool Materials
    public static ToolMaterial gem = EnumHelper.addToolMaterial("gem", 4, 2300, 8.0f, 3.5f, 10);
    public static ToolMaterial gem2 = EnumHelper.addToolMaterial("gem2", 5, 2500, 9.0f, 4.5f, 12);
    
    
    public static oreGenerationClass WorldGen = new oreGenerationClass();
    //Items
    public static Item itemDarkGem;
    public static Item itemInFusedGem;
    public static Item itemBlueGem;
    public static Item itemMagicalGem;
    public static Item itemBlueShard;
    public static Item itemGreenGem;
    public static Item itemGreenShard;
    	
    //Tools
    public final static Item DarkPickaxe = new DarkPickaxe(2001, gem);
    public final static Item DarkSpade = new DarkSpade(2002, gem);
    public final static Item DarkSword = new DarkSword(2003, gem);
    public final static Item DarkAxe = new DarkAxe(2004, gem);
    
    //Creative Tabs
    public static CreativeTabs tabdarkBlocks = new CreativeTabs("tabdarkBlocks"){
    public Item getTabIconItem(){
    	return Item.getItemFromBlock(darkblock);
    }


     };
     public static CreativeTabs tabdarkItems = new CreativeTabs("tabdarkgems"){
     public Item getTabIconItem(){
    		return itemDarkGem;
     }
     };
     /////////////////////////////////////////////////////////////////////////////////////////
     @EventHandler
     public void PreInit(FMLPreInitializationEvent event){
     proxy.registerRenderers();
     //Blocks
     darkblock = (new darkblock(2001, 0));
     darkOre = new darkOre(Material.rock).setBlockName("darkOre");
     //Items
     itemDarkGem = (new darkgem(2002)).setUnlocalizedName("itemgarkgem");
     itemInFusedGem = (new infusedgem(20122)).setUnlocalizedName("iteminfusedgem");
     itemBlueGem = (new bluegem(43545)).setUnlocalizedName("itembluegem");
     itemMagicalGem = (new magicalgem(56356)).setUnlocalizedName("itemmagicalgem");
     itemBlueShard = (new blueshard(4499)).setUnlocalizedName("itemblueshard");
     itemGreenGem = (new greengem(6666)).setUnlocalizedName("itemgreengem");
     itemGreenShard = (new greenshard(6666)).setUnlocalizedName("itemgreenshard");
     //Register
     GameRegistry.registerItem(itemDarkGem, "itemdarkgem");
     GameRegistry.registerBlock(darkblock, "darkblock");
	 GameRegistry.registerItem(DarkPickaxe, "DarkPickaxe");
	 GameRegistry.registerItem(DarkSpade, "DarkSpade");
	 GameRegistry.registerItem(DarkSword, "DarkSword");
	 GameRegistry.registerItem(DarkAxe, "DarkAxe");
	 GameRegistry.registerBlock(darkOre, "darkore");
	 GameRegistry.registerItem(itemInFusedGem, "iteminfusedgem");
	 GameRegistry.registerItem(itemBlueGem, "itembluegem");
	 GameRegistry.registerItem(itemMagicalGem, "itemmagicalgem");
	 GameRegistry.registerItem(itemBlueShard, "itemblueshard");
	 GameRegistry.registerItem(itemGreenGem, "itemgreengem");
	 GameRegistry.registerItem(itemGreenShard, "itemgreenshard");
     //Putting items into tabs
     DarkPickaxe.setCreativeTab(this.tabdarkItems);
     darkblock.setCreativeTab(this.tabdarkBlocks);
     DarkSpade.setCreativeTab(this.tabdarkItems);
     DarkAxe.setCreativeTab(this.tabdarkItems);
     DarkSword.setCreativeTab(this.tabdarkItems);
     itemDarkGem.setCreativeTab(this.tabdarkItems);
     darkOre.setCreativeTab(this.tabdarkBlocks);
     itemInFusedGem.setCreativeTab(this.tabdarkItems);
     itemBlueGem.setCreativeTab(this.tabdarkItems);
     itemMagicalGem.setCreativeTab(this.tabdarkItems);
     itemBlueShard.setCreativeTab(this.tabdarkItems);
     itemGreenGem.setCreativeTab(this.tabdarkItems);
     itemGreenShard.setCreativeTab(this.tabdarkItems);
    {
    }
	}
    ///////////////////////////////////////////////////////////////////////////////////////////
	@EventHandler
	public void Init(FMLInitializationEvent event) {
	//tabs
	LanguageRegistry.instance().addStringLocalization("itemGroup.tabdarkgems", "en_US", "Dark Items");
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabdarkBlocks", "en_US", "Dark Blocks");
		
	//Armor
	//Crafting
	GameRegistry.addShapedRecipe(new ItemStack(Items.slime_ball, 3), "XXX", "XXX", "XXX", 'X', Blocks.mossy_cobblestone);
	GameRegistry.addShapedRecipe(new ItemStack(darkblock), "XXX", "XXX", "XXX", 'X', itemDarkGem);
	GameRegistry.addShapedRecipe(new ItemStack(DarkPickaxe), "XXX", " Y ", " Y ", 'X', itemDarkGem, 'Y', Items.stick);
	GameRegistry.addShapedRecipe(new ItemStack(DarkSword), " X ", " X ", " Y ", 'X', itemDarkGem, 'Y', Items.stick);
	GameRegistry.addShapedRecipe(new ItemStack(DarkAxe), " XX", " YX", " Y ", 'X', itemDarkGem, 'Y', Items.stick);
	GameRegistry.addShapedRecipe(new ItemStack(DarkSpade), " X ", " Y ", " Y ", 'X', itemDarkGem, 'Y', Items.stick);
	GameRegistry.addShapelessRecipe(new ItemStack(itemDarkGem, 9), darkblock);
	GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 6), Items.diamond_sword, Items.diamond_pickaxe, Items.diamond_shovel);
	GameRegistry.addSmelting(darkOre, new ItemStack(itemDarkGem), 0.1f); //First item is what you put in the furnace.
	GameRegistry.addShapelessRecipe(new ItemStack(itemBlueGem), itemDarkGem, itemBlueShard);
	GameRegistry.addShapelessRecipe(new ItemStack(itemGreenGem), itemDarkGem, itemGreenShard);
		
	//Register World Gen
	GameRegistry.registerWorldGenerator(WorldGen, 1);
	//Smelting
	//Language Registry
	LanguageRegistry.addName(darkblock, "Dark Gem Block");
	LanguageRegistry.addName(DarkPickaxe, "Dark Pickaxe");
	LanguageRegistry.addName(DarkAxe, "Dark Axe");
	LanguageRegistry.addName(DarkSpade, "Dark Shovel");
	LanguageRegistry.addName(DarkSword, "Dark Sword");
	LanguageRegistry.addName(itemDarkGem, "Dark Gem");
	LanguageRegistry.addName(darkOre, "Dark Ore");
	LanguageRegistry.addName(itemInFusedGem, "Infused Dark Gem");
	LanguageRegistry.addName(itemBlueGem, "Blue Dark Gem");
	LanguageRegistry.addName(itemMagicalGem, "Magical Dark Gem");
	LanguageRegistry.addName(itemBlueShard, "Blue Shards");
	LanguageRegistry.addName(itemGreenGem, "Green Dark Gem");
	LanguageRegistry.addName(itemGreenShard, "Green Shards");
	    

	   	
	}
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	
    }
	}
