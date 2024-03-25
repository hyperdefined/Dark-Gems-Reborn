package hyperdefined.darkgemsrb.blocks;

import hyperdefined.darkgemsrb.mainClass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class darkblock extends Block{

public darkblock(int par1, int par2) {
	super(Material.rock);
	this.setStepSound(soundTypeStone);
	this.setHardness(10f);
	this.setResistance(5f);
	this.setBlockTextureName(mainClass.MODID + ":" + "dark_block");
	this.setBlockName("darkblock");
}
	
}



		
