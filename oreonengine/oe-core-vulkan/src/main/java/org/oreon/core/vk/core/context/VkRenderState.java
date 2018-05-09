package org.oreon.core.vk.core.context;

import java.util.ArrayList;
import java.util.List;

import org.oreon.core.context.RenderState;
import org.oreon.core.vk.core.command.CommandBuffer;
import org.oreon.core.vk.core.framebuffer.VkFrameBuffer;
import org.oreon.core.vk.core.pipeline.RenderPass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VkRenderState extends RenderState{
	
	private VkFrameBuffer offScreenFrameBuffer;
	private RenderPass offScreenRenderPass;
	private int offScreenAttachmentCount;
	private List<CommandBuffer> offScreenSecondaryCmdBuffers;
	
	public VkRenderState() {
		offScreenSecondaryCmdBuffers = new ArrayList<CommandBuffer>();
	}

}