package com.stal111.valhelsia_structures.tileentity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.stal111.valhelsia_structures.ValhelsiaStructures;
import com.stal111.valhelsia_structures.common.block.properties.ModBlockStateProperties;
import com.stal111.valhelsia_structures.tileentity.GiantFernTileEntity;
import com.stal111.valhelsia_structures.tileentity.model.GiantFernModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;

/**
 * Giant Fern Tile Entity Renderer
 * Valhelsia Structures - com.stal111.valhelsia_structures.tileentity.renderer.GiantFernTileEntityRenderer
 *
 * @author Valhelsia Team
 * @version 16.1.0
 * @since 2020-12-22
 */
public class GiantFernTileEntityRenderer extends BlockEntityRenderer<GiantFernTileEntity> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(ValhelsiaStructures.MOD_ID, "textures/block/giant_fern.png");

    private final GiantFernModel model = new GiantFernModel();

    public GiantFernTileEntityRenderer(BlockEntityRenderDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
    }

    @Override
    public void render(GiantFernTileEntity tileEntity, float partialTicks, PoseStack matrixStack, MultiBufferSource buffer, int combinedLight, int combinedOverlay) {
        matrixStack.push();

        matrixStack.translate(0.5, 1.5, 0.5);
        matrixStack.rotate(Vector3f.ZP.rotationDegrees(180));

        if (tileEntity.getBlockState().get(ModBlockStateProperties.ROTATED)) {
            matrixStack.rotate(Vector3f.YP.rotationDegrees(45));
        }

        model.render(matrixStack, buffer.getBuffer(model.getRenderType(TEXTURE)), combinedLight, combinedOverlay, 1.0F, 1.0F, 1.0F, 1.0F);

        matrixStack.pop();
    }
}
