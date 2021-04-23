/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.blog.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.blog.ide.contentassist.antlr.internal.InternalBlogParser;
import org.xtext.example.blog.services.BlogGrammarAccess;

public class BlogParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(BlogGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, BlogGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getSectionContentAccess().getAlternatives(), "rule__SectionContent__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getModelAccess().getGroup_0(), "rule__Model__Group_0__0");
			builder.put(grammarAccess.getModelAccess().getGroup_1(), "rule__Model__Group_1__0");
			builder.put(grammarAccess.getImageAccess().getGroup(), "rule__Image__Group__0");
			builder.put(grammarAccess.getCategoryAccess().getGroup(), "rule__Category__Group__0");
			builder.put(grammarAccess.getSiteAccess().getGroup(), "rule__Site__Group__0");
			builder.put(grammarAccess.getSiteAccess().getGroup_7(), "rule__Site__Group_7__0");
			builder.put(grammarAccess.getSiteAccess().getGroup_8(), "rule__Site__Group_8__0");
			builder.put(grammarAccess.getSiteAccess().getGroup_9(), "rule__Site__Group_9__0");
			builder.put(grammarAccess.getPageAccess().getGroup(), "rule__Page__Group__0");
			builder.put(grammarAccess.getPageAccess().getGroup_7(), "rule__Page__Group_7__0");
			builder.put(grammarAccess.getPageAccess().getGroup_7_4(), "rule__Page__Group_7_4__0");
			builder.put(grammarAccess.getPageAccess().getGroup_8(), "rule__Page__Group_8__0");
			builder.put(grammarAccess.getSectionAccess().getGroup(), "rule__Section__Group__0");
			builder.put(grammarAccess.getParagraphContentAccess().getGroup(), "rule__ParagraphContent__Group__0");
			builder.put(grammarAccess.getImageContentAccess().getGroup(), "rule__ImageContent__Group__0");
			builder.put(grammarAccess.getModelAccess().getImagesAssignment_0_2(), "rule__Model__ImagesAssignment_0_2");
			builder.put(grammarAccess.getModelAccess().getCategoriesAssignment_1_2(), "rule__Model__CategoriesAssignment_1_2");
			builder.put(grammarAccess.getModelAccess().getSiteAssignment_2(), "rule__Model__SiteAssignment_2");
			builder.put(grammarAccess.getImageAccess().getNameAssignment_0(), "rule__Image__NameAssignment_0");
			builder.put(grammarAccess.getImageAccess().getUrlAssignment_2(), "rule__Image__UrlAssignment_2");
			builder.put(grammarAccess.getCategoryAccess().getNameAssignment_0(), "rule__Category__NameAssignment_0");
			builder.put(grammarAccess.getSiteAccess().getNameAssignment_1(), "rule__Site__NameAssignment_1");
			builder.put(grammarAccess.getSiteAccess().getDescriptionAssignment_5(), "rule__Site__DescriptionAssignment_5");
			builder.put(grammarAccess.getSiteAccess().getHasNavbarAssignment_7_0(), "rule__Site__HasNavbarAssignment_7_0");
			builder.put(grammarAccess.getSiteAccess().getIconUrlAssignment_8_2(), "rule__Site__IconUrlAssignment_8_2");
			builder.put(grammarAccess.getSiteAccess().getPagesAssignment_9_2(), "rule__Site__PagesAssignment_9_2");
			builder.put(grammarAccess.getPageAccess().getNameAssignment_1(), "rule__Page__NameAssignment_1");
			builder.put(grammarAccess.getPageAccess().getDescriptionAssignment_5(), "rule__Page__DescriptionAssignment_5");
			builder.put(grammarAccess.getPageAccess().getCategoriesAssignment_7_3(), "rule__Page__CategoriesAssignment_7_3");
			builder.put(grammarAccess.getPageAccess().getCategoriesAssignment_7_4_1(), "rule__Page__CategoriesAssignment_7_4_1");
			builder.put(grammarAccess.getPageAccess().getSectionsAssignment_8_2(), "rule__Page__SectionsAssignment_8_2");
			builder.put(grammarAccess.getSectionAccess().getNameAssignment_1(), "rule__Section__NameAssignment_1");
			builder.put(grammarAccess.getSectionAccess().getContentAssignment_3(), "rule__Section__ContentAssignment_3");
			builder.put(grammarAccess.getParagraphContentAccess().getContentAssignment_2(), "rule__ParagraphContent__ContentAssignment_2");
			builder.put(grammarAccess.getImageContentAccess().getImageAssignment_2(), "rule__ImageContent__ImageAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private BlogGrammarAccess grammarAccess;

	@Override
	protected InternalBlogParser createParser() {
		InternalBlogParser result = new InternalBlogParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public BlogGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BlogGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
