package hyperdefined.darkgemsrb.blocks;

import java.util.Random;

import hyperdefined.darkgemsrb.mainClass;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class darkOre extends Block{

	public darkOre(Material arg0) {
		super(arg0);
		setHardness(5f);
		setResistance(7.0f);
		setBlockTextureName(mainClass.MODID + ":" + "darkore");
		
	}
	
}
