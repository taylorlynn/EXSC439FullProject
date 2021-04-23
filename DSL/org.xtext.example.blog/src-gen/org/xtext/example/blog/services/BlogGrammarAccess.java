/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.blog.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class BlogGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.blog.Blog.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Keyword cImagesKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Keyword cColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cImagesAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cImagesImageParserRuleCall_0_2_0 = (RuleCall)cImagesAssignment_0_2.eContents().get(0);
		private final Keyword cEndKeyword_0_3 = (Keyword)cGroup_0.eContents().get(3);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCategoriesKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cColonKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cCategoriesAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cCategoriesCategoryParserRuleCall_1_2_0 = (RuleCall)cCategoriesAssignment_1_2.eContents().get(0);
		private final Keyword cEndKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		private final Assignment cSiteAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSiteSiteParserRuleCall_2_0 = (RuleCall)cSiteAssignment_2.eContents().get(0);
		
		//Model:
		//	('images' ':' images+=Image+ 'end')? ('categories' ':' categories+=Category+ 'end')?
		//	site=Site;
		@Override public ParserRule getRule() { return rule; }
		
		//('images' ':' images+=Image+ 'end')? ('categories' ':' categories+=Category+ 'end')?
		//site=Site
		public Group getGroup() { return cGroup; }
		
		//('images' ':' images+=Image+ 'end')?
		public Group getGroup_0() { return cGroup_0; }
		
		//'images'
		public Keyword getImagesKeyword_0_0() { return cImagesKeyword_0_0; }
		
		//':'
		public Keyword getColonKeyword_0_1() { return cColonKeyword_0_1; }
		
		//images+=Image+
		public Assignment getImagesAssignment_0_2() { return cImagesAssignment_0_2; }
		
		//Image
		public RuleCall getImagesImageParserRuleCall_0_2_0() { return cImagesImageParserRuleCall_0_2_0; }
		
		//'end'
		public Keyword getEndKeyword_0_3() { return cEndKeyword_0_3; }
		
		//('categories' ':' categories+=Category+ 'end')?
		public Group getGroup_1() { return cGroup_1; }
		
		//'categories'
		public Keyword getCategoriesKeyword_1_0() { return cCategoriesKeyword_1_0; }
		
		//':'
		public Keyword getColonKeyword_1_1() { return cColonKeyword_1_1; }
		
		//categories+=Category+
		public Assignment getCategoriesAssignment_1_2() { return cCategoriesAssignment_1_2; }
		
		//Category
		public RuleCall getCategoriesCategoryParserRuleCall_1_2_0() { return cCategoriesCategoryParserRuleCall_1_2_0; }
		
		//'end'
		public Keyword getEndKeyword_1_3() { return cEndKeyword_1_3; }
		
		//site=Site
		public Assignment getSiteAssignment_2() { return cSiteAssignment_2; }
		
		//Site
		public RuleCall getSiteSiteParserRuleCall_2_0() { return cSiteSiteParserRuleCall_2_0; }
	}
	public class ImageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.blog.Blog.Image");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cUrlAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cUrlSTRINGTerminalRuleCall_2_0 = (RuleCall)cUrlAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Image:
		//	name=ID ':' url=STRING ';';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' url=STRING ';'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//url=STRING
		public Assignment getUrlAssignment_2() { return cUrlAssignment_2; }
		
		//STRING
		public RuleCall getUrlSTRINGTerminalRuleCall_2_0() { return cUrlSTRINGTerminalRuleCall_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class CategoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.blog.Blog.Category");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Category:
		//	name=ID ';';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ';'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//';'
		public Keyword getSemicolonKeyword_1() { return cSemicolonKeyword_1; }
	}
	public class SiteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.blog.Blog.Site");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSiteKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cDescriptionKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cColonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cDescriptionAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_5_0 = (RuleCall)cDescriptionAssignment_5.eContents().get(0);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Assignment cHasNavbarAssignment_7_0 = (Assignment)cGroup_7.eContents().get(0);
		private final Keyword cHasNavbarHas_navbarKeyword_7_0_0 = (Keyword)cHasNavbarAssignment_7_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_7_1 = (Keyword)cGroup_7.eContents().get(1);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cIconKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Keyword cColonKeyword_8_1 = (Keyword)cGroup_8.eContents().get(1);
		private final Assignment cIconUrlAssignment_8_2 = (Assignment)cGroup_8.eContents().get(2);
		private final RuleCall cIconUrlSTRINGTerminalRuleCall_8_2_0 = (RuleCall)cIconUrlAssignment_8_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_8_3 = (Keyword)cGroup_8.eContents().get(3);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cPagesKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Keyword cColonKeyword_9_1 = (Keyword)cGroup_9.eContents().get(1);
		private final Assignment cPagesAssignment_9_2 = (Assignment)cGroup_9.eContents().get(2);
		private final RuleCall cPagesPageParserRuleCall_9_2_0 = (RuleCall)cPagesAssignment_9_2.eContents().get(0);
		private final Keyword cEndKeyword_9_3 = (Keyword)cGroup_9.eContents().get(3);
		private final Keyword cEndKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//Site:
		//	'site' name=STRING ':'
		//	'description' ':' description=STRING ';' (hasNavbar?='has_navbar'';')? ('icon' ':' iconUrl=STRING ';')? ('pages' ':'
		//	pages+=Page+ 'end')?
		//	'end';
		@Override public ParserRule getRule() { return rule; }
		
		//'site' name=STRING ':'
		//'description' ':' description=STRING ';' (hasNavbar?='has_navbar'';')? ('icon' ':' iconUrl=STRING ';')? ('pages' ':'
		//pages+=Page+ 'end')?
		//'end'
		public Group getGroup() { return cGroup; }
		
		//'site'
		public Keyword getSiteKeyword_0() { return cSiteKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//'description'
		public Keyword getDescriptionKeyword_3() { return cDescriptionKeyword_3; }
		
		//':'
		public Keyword getColonKeyword_4() { return cColonKeyword_4; }
		
		//description=STRING
		public Assignment getDescriptionAssignment_5() { return cDescriptionAssignment_5; }
		
		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_5_0() { return cDescriptionSTRINGTerminalRuleCall_5_0; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
		
		//(hasNavbar?='has_navbar'';')?
		public Group getGroup_7() { return cGroup_7; }
		
		//hasNavbar?='has_navbar'
		public Assignment getHasNavbarAssignment_7_0() { return cHasNavbarAssignment_7_0; }
		
		//'has_navbar'
		public Keyword getHasNavbarHas_navbarKeyword_7_0_0() { return cHasNavbarHas_navbarKeyword_7_0_0; }
		
		//';'
		public Keyword getSemicolonKeyword_7_1() { return cSemicolonKeyword_7_1; }
		
		//('icon' ':' iconUrl=STRING ';')?
		public Group getGroup_8() { return cGroup_8; }
		
		//'icon'
		public Keyword getIconKeyword_8_0() { return cIconKeyword_8_0; }
		
		//':'
		public Keyword getColonKeyword_8_1() { return cColonKeyword_8_1; }
		
		//iconUrl=STRING
		public Assignment getIconUrlAssignment_8_2() { return cIconUrlAssignment_8_2; }
		
		//STRING
		public RuleCall getIconUrlSTRINGTerminalRuleCall_8_2_0() { return cIconUrlSTRINGTerminalRuleCall_8_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_8_3() { return cSemicolonKeyword_8_3; }
		
		//('pages' ':' pages+=Page+ 'end')?
		public Group getGroup_9() { return cGroup_9; }
		
		//'pages'
		public Keyword getPagesKeyword_9_0() { return cPagesKeyword_9_0; }
		
		//':'
		public Keyword getColonKeyword_9_1() { return cColonKeyword_9_1; }
		
		//pages+=Page+
		public Assignment getPagesAssignment_9_2() { return cPagesAssignment_9_2; }
		
		//Page
		public RuleCall getPagesPageParserRuleCall_9_2_0() { return cPagesPageParserRuleCall_9_2_0; }
		
		//'end'
		public Keyword getEndKeyword_9_3() { return cEndKeyword_9_3; }
		
		//'end'
		public Keyword getEndKeyword_10() { return cEndKeyword_10; }
	}
	public class PageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.blog.Blog.Page");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cDescriptionKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cColonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cDescriptionAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_5_0 = (RuleCall)cDescriptionAssignment_5.eContents().get(0);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cCategoriesKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Keyword cColonKeyword_7_1 = (Keyword)cGroup_7.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_7_2 = (Keyword)cGroup_7.eContents().get(2);
		private final Assignment cCategoriesAssignment_7_3 = (Assignment)cGroup_7.eContents().get(3);
		private final CrossReference cCategoriesCategoryCrossReference_7_3_0 = (CrossReference)cCategoriesAssignment_7_3.eContents().get(0);
		private final RuleCall cCategoriesCategoryIDTerminalRuleCall_7_3_0_1 = (RuleCall)cCategoriesCategoryCrossReference_7_3_0.eContents().get(1);
		private final Group cGroup_7_4 = (Group)cGroup_7.eContents().get(4);
		private final Keyword cCommaKeyword_7_4_0 = (Keyword)cGroup_7_4.eContents().get(0);
		private final Assignment cCategoriesAssignment_7_4_1 = (Assignment)cGroup_7_4.eContents().get(1);
		private final CrossReference cCategoriesCategoryCrossReference_7_4_1_0 = (CrossReference)cCategoriesAssignment_7_4_1.eContents().get(0);
		private final RuleCall cCategoriesCategoryIDTerminalRuleCall_7_4_1_0_1 = (RuleCall)cCategoriesCategoryCrossReference_7_4_1_0.eContents().get(1);
		private final Keyword cRightSquareBracketKeyword_7_5 = (Keyword)cGroup_7.eContents().get(5);
		private final Keyword cSemicolonKeyword_7_6 = (Keyword)cGroup_7.eContents().get(6);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cSectionsKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Keyword cColonKeyword_8_1 = (Keyword)cGroup_8.eContents().get(1);
		private final Assignment cSectionsAssignment_8_2 = (Assignment)cGroup_8.eContents().get(2);
		private final RuleCall cSectionsSectionParserRuleCall_8_2_0 = (RuleCall)cSectionsAssignment_8_2.eContents().get(0);
		private final Keyword cEndKeyword_8_3 = (Keyword)cGroup_8.eContents().get(3);
		private final Keyword cEndKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//Page:
		//	'page' name=STRING ':'
		//	'description' ':' description=STRING ';' ('categories' ':' '[' categories+=[Category] (',' categories+=[Category])*
		//	']' ';')? ('sections' ':' sections+=Section+ 'end')?
		//	'end';
		@Override public ParserRule getRule() { return rule; }
		
		//'page' name=STRING ':'
		//'description' ':' description=STRING ';' ('categories' ':' '[' categories+=[Category] (',' categories+=[Category])* ']'
		//';')? ('sections' ':' sections+=Section+ 'end')?
		//'end'
		public Group getGroup() { return cGroup; }
		
		//'page'
		public Keyword getPageKeyword_0() { return cPageKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//'description'
		public Keyword getDescriptionKeyword_3() { return cDescriptionKeyword_3; }
		
		//':'
		public Keyword getColonKeyword_4() { return cColonKeyword_4; }
		
		//description=STRING
		public Assignment getDescriptionAssignment_5() { return cDescriptionAssignment_5; }
		
		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_5_0() { return cDescriptionSTRINGTerminalRuleCall_5_0; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
		
		//('categories' ':' '[' categories+=[Category] (',' categories+=[Category])* ']' ';')?
		public Group getGroup_7() { return cGroup_7; }
		
		//'categories'
		public Keyword getCategoriesKeyword_7_0() { return cCategoriesKeyword_7_0; }
		
		//':'
		public Keyword getColonKeyword_7_1() { return cColonKeyword_7_1; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_7_2() { return cLeftSquareBracketKeyword_7_2; }
		
		//categories+=[Category]
		public Assignment getCategoriesAssignment_7_3() { return cCategoriesAssignment_7_3; }
		
		//[Category]
		public CrossReference getCategoriesCategoryCrossReference_7_3_0() { return cCategoriesCategoryCrossReference_7_3_0; }
		
		//ID
		public RuleCall getCategoriesCategoryIDTerminalRuleCall_7_3_0_1() { return cCategoriesCategoryIDTerminalRuleCall_7_3_0_1; }
		
		//(',' categories+=[Category])*
		public Group getGroup_7_4() { return cGroup_7_4; }
		
		//','
		public Keyword getCommaKeyword_7_4_0() { return cCommaKeyword_7_4_0; }
		
		//categories+=[Category]
		public Assignment getCategoriesAssignment_7_4_1() { return cCategoriesAssignment_7_4_1; }
		
		//[Category]
		public CrossReference getCategoriesCategoryCrossReference_7_4_1_0() { return cCategoriesCategoryCrossReference_7_4_1_0; }
		
		//ID
		public RuleCall getCategoriesCategoryIDTerminalRuleCall_7_4_1_0_1() { return cCategoriesCategoryIDTerminalRuleCall_7_4_1_0_1; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_7_5() { return cRightSquareBracketKeyword_7_5; }
		
		//';'
		public Keyword getSemicolonKeyword_7_6() { return cSemicolonKeyword_7_6; }
		
		//('sections' ':' sections+=Section+ 'end')?
		public Group getGroup_8() { return cGroup_8; }
		
		//'sections'
		public Keyword getSectionsKeyword_8_0() { return cSectionsKeyword_8_0; }
		
		//':'
		public Keyword getColonKeyword_8_1() { return cColonKeyword_8_1; }
		
		//sections+=Section+
		public Assignment getSectionsAssignment_8_2() { return cSectionsAssignment_8_2; }
		
		//Section
		public RuleCall getSectionsSectionParserRuleCall_8_2_0() { return cSectionsSectionParserRuleCall_8_2_0; }
		
		//'end'
		public Keyword getEndKeyword_8_3() { return cEndKeyword_8_3; }
		
		//'end'
		public Keyword getEndKeyword_9() { return cEndKeyword_9; }
	}
	public class SectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.blog.Blog.Section");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSectionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cContentAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cContentSectionContentParserRuleCall_3_0 = (RuleCall)cContentAssignment_3.eContents().get(0);
		private final Keyword cEndKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Section:
		//	'section' name=STRING ':'
		//	content+=SectionContent*
		//	'end';
		@Override public ParserRule getRule() { return rule; }
		
		//'section' name=STRING ':'
		//content+=SectionContent*
		//'end'
		public Group getGroup() { return cGroup; }
		
		//'section'
		public Keyword getSectionKeyword_0() { return cSectionKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//content+=SectionContent*
		public Assignment getContentAssignment_3() { return cContentAssignment_3; }
		
		//SectionContent
		public RuleCall getContentSectionContentParserRuleCall_3_0() { return cContentSectionContentParserRuleCall_3_0; }
		
		//'end'
		public Keyword getEndKeyword_4() { return cEndKeyword_4; }
	}
	public class SectionContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.blog.Blog.SectionContent");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cParagraphContentParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cImageContentParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//SectionContent:
		//	ParagraphContent | ImageContent;
		@Override public ParserRule getRule() { return rule; }
		
		//ParagraphContent | ImageContent
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ParagraphContent
		public RuleCall getParagraphContentParserRuleCall_0() { return cParagraphContentParserRuleCall_0; }
		
		//ImageContent
		public RuleCall getImageContentParserRuleCall_1() { return cImageContentParserRuleCall_1; }
	}
	public class ParagraphContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.blog.Blog.ParagraphContent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cParagraphKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cContentAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cContentSTRINGTerminalRuleCall_2_0 = (RuleCall)cContentAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ParagraphContent:
		//	'paragraph' ':' content=STRING ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'paragraph' ':' content=STRING ';'
		public Group getGroup() { return cGroup; }
		
		//'paragraph'
		public Keyword getParagraphKeyword_0() { return cParagraphKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//content=STRING
		public Assignment getContentAssignment_2() { return cContentAssignment_2; }
		
		//STRING
		public RuleCall getContentSTRINGTerminalRuleCall_2_0() { return cContentSTRINGTerminalRuleCall_2_0; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class ImageContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.blog.Blog.ImageContent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cImageAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cImageImageCrossReference_2_0 = (CrossReference)cImageAssignment_2.eContents().get(0);
		private final RuleCall cImageImageIDTerminalRuleCall_2_0_1 = (RuleCall)cImageImageCrossReference_2_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ImageContent:
		//	'image' ':' image=[Image] ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'image' ':' image=[Image] ';'
		public Group getGroup() { return cGroup; }
		
		//'image'
		public Keyword getImageKeyword_0() { return cImageKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//image=[Image]
		public Assignment getImageAssignment_2() { return cImageAssignment_2; }
		
		//[Image]
		public CrossReference getImageImageCrossReference_2_0() { return cImageImageCrossReference_2_0; }
		
		//ID
		public RuleCall getImageImageIDTerminalRuleCall_2_0_1() { return cImageImageIDTerminalRuleCall_2_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	
	
	private final ModelElements pModel;
	private final ImageElements pImage;
	private final CategoryElements pCategory;
	private final SiteElements pSite;
	private final PageElements pPage;
	private final SectionElements pSection;
	private final SectionContentElements pSectionContent;
	private final ParagraphContentElements pParagraphContent;
	private final ImageContentElements pImageContent;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public BlogGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pImage = new ImageElements();
		this.pCategory = new CategoryElements();
		this.pSite = new SiteElements();
		this.pPage = new PageElements();
		this.pSection = new SectionElements();
		this.pSectionContent = new SectionContentElements();
		this.pParagraphContent = new ParagraphContentElements();
		this.pImageContent = new ImageContentElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.blog.Blog".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	('images' ':' images+=Image+ 'end')? ('categories' ':' categories+=Category+ 'end')?
	//	site=Site;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Image:
	//	name=ID ':' url=STRING ';';
	public ImageElements getImageAccess() {
		return pImage;
	}
	
	public ParserRule getImageRule() {
		return getImageAccess().getRule();
	}
	
	//Category:
	//	name=ID ';';
	public CategoryElements getCategoryAccess() {
		return pCategory;
	}
	
	public ParserRule getCategoryRule() {
		return getCategoryAccess().getRule();
	}
	
	//Site:
	//	'site' name=STRING ':'
	//	'description' ':' description=STRING ';' (hasNavbar?='has_navbar'';')? ('icon' ':' iconUrl=STRING ';')? ('pages' ':'
	//	pages+=Page+ 'end')?
	//	'end';
	public SiteElements getSiteAccess() {
		return pSite;
	}
	
	public ParserRule getSiteRule() {
		return getSiteAccess().getRule();
	}
	
	//Page:
	//	'page' name=STRING ':'
	//	'description' ':' description=STRING ';' ('categories' ':' '[' categories+=[Category] (',' categories+=[Category])*
	//	']' ';')? ('sections' ':' sections+=Section+ 'end')?
	//	'end';
	public PageElements getPageAccess() {
		return pPage;
	}
	
	public ParserRule getPageRule() {
		return getPageAccess().getRule();
	}
	
	//Section:
	//	'section' name=STRING ':'
	//	content+=SectionContent*
	//	'end';
	public SectionElements getSectionAccess() {
		return pSection;
	}
	
	public ParserRule getSectionRule() {
		return getSectionAccess().getRule();
	}
	
	//SectionContent:
	//	ParagraphContent | ImageContent;
	public SectionContentElements getSectionContentAccess() {
		return pSectionContent;
	}
	
	public ParserRule getSectionContentRule() {
		return getSectionContentAccess().getRule();
	}
	
	//ParagraphContent:
	//	'paragraph' ':' content=STRING ';';
	public ParagraphContentElements getParagraphContentAccess() {
		return pParagraphContent;
	}
	
	public ParserRule getParagraphContentRule() {
		return getParagraphContentAccess().getRule();
	}
	
	//ImageContent:
	//	'image' ':' image=[Image] ';';
	public ImageContentElements getImageContentAccess() {
		return pImageContent;
	}
	
	public ParserRule getImageContentRule() {
		return getImageContentAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}