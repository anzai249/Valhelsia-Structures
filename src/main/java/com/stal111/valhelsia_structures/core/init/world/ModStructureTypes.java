package com.stal111.valhelsia_structures.core.init.world;

import com.stal111.valhelsia_structures.common.world.structures.LegacyValhelsiaJigsawStructure;
import com.stal111.valhelsia_structures.common.world.structures.ValhelsiaJigsawStructure;
import com.stal111.valhelsia_structures.core.ValhelsiaStructures;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraftforge.registries.RegistryObject;
import net.valhelsia.valhelsia_core.core.registry.RegistryClass;
import net.valhelsia.valhelsia_core.core.registry.helper.RegistryHelper;

/**
 * @author Valhelsia Team
 * @since 2022-06-24
 */
public class ModStructureTypes implements RegistryClass {

    public static final RegistryHelper<StructureType<?>> HELPER = ValhelsiaStructures.REGISTRY_MANAGER.getHelper(Registries.STRUCTURE_TYPE);

    public static final RegistryObject<StructureType<ValhelsiaJigsawStructure>> VALHELSIA_JIGSAW_STRUCTURE = HELPER.register("valhelsia_jigsaw_structure", () -> () -> ValhelsiaJigsawStructure.CODEC);
    public static final RegistryObject<StructureType<LegacyValhelsiaJigsawStructure>> LEGACY_VALHELSIA_JIGSAW_STRUCTURE = HELPER.register("legacy_valhelsia_jigsaw_structure", () -> () -> LegacyValhelsiaJigsawStructure.CODEC);
}
