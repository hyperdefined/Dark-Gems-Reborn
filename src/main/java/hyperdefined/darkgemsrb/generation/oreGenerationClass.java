package hyperdefined.darkgemsrb.generation;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

import hyperdefined.darkgemsrb.mainClass;

public class oreGenerationClass implements IWorldGenerator  {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
		case -1: 
			generateInNether(world, random, chunkX*16, chunkZ*16);
			break;
		case 0: 
			generateInOverWorld(world, random, chunkX*16, chunkZ*16);
			break; 
		case 1: 
			generateInEnd(world, random, chunkX*16, chunkZ*16);
			break;
		}
		}

	private void generateInEnd(World world, Random random, int x, int z) {
		
		
	}

	private void generateInOverWorld(World world, Random random, int x, int z) {
	//Gen Ores
		for(int i = 0; i < 60; i++){  //the 50 is the rarity. higher = more common.
			int chunkX = x + random.nextInt(16);
			int chunkZ = z + random.nextInt(16);
			int chunkY = random.nextInt(55); //the number on the Y in nextInt is height for it to spawn
			
			(new WorldGenMinable(mainClass.darkOre, 2)).generate(world, random, chunkX, chunkY, chunkZ);
		}
	}

	private void generateInNether(World world, Random random, int x, int z) {
		
		
	}
	}
