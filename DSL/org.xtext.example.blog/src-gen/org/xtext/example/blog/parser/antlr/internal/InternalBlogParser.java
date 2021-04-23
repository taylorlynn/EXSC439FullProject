package org.xtext.example.blog.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.blog.services.BlogGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBlogParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'images'", "':'", "'end'", "'categories'", "';'", "'site'", "'description'", "'has_navbar'", "'icon'", "'pages'", "'page'", "'['", "','", "']'", "'sections'", "'section'", "'paragraph'", "'image'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalBlogParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBlogParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBlogParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBlog.g"; }



     	private BlogGrammarAccess grammarAccess;

        public InternalBlogParser(TokenStream input, BlogGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected BlogGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalBlog.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalBlog.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalBlog.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalBlog.g:71:1: ruleModel returns [EObject current=null] : ( (otherlv_0= 'images' otherlv_1= ':' ( (lv_images_2_0= ruleImage ) )+ otherlv_3= 'end' )? (otherlv_4= 'categories' otherlv_5= ':' ( (lv_categories_6_0= ruleCategory ) )+ otherlv_7= 'end' )? ( (lv_site_8_0= ruleSite ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_images_2_0 = null;

        EObject lv_categories_6_0 = null;

        EObject lv_site_8_0 = null;



        	enterRule();

        try {
            // InternalBlog.g:77:2: ( ( (otherlv_0= 'images' otherlv_1= ':' ( (lv_images_2_0= ruleImage ) )+ otherlv_3= 'end' )? (otherlv_4= 'categories' otherlv_5= ':' ( (lv_categories_6_0= ruleCategory ) )+ otherlv_7= 'end' )? ( (lv_site_8_0= ruleSite ) ) ) )
            // InternalBlog.g:78:2: ( (otherlv_0= 'images' otherlv_1= ':' ( (lv_images_2_0= ruleImage ) )+ otherlv_3= 'end' )? (otherlv_4= 'categories' otherlv_5= ':' ( (lv_categories_6_0= ruleCategory ) )+ otherlv_7= 'end' )? ( (lv_site_8_0= ruleSite ) ) )
            {
            // InternalBlog.g:78:2: ( (otherlv_0= 'images' otherlv_1= ':' ( (lv_images_2_0= ruleImage ) )+ otherlv_3= 'end' )? (otherlv_4= 'categories' otherlv_5= ':' ( (lv_categories_6_0= ruleCategory ) )+ otherlv_7= 'end' )? ( (lv_site_8_0= ruleSite ) ) )
            // InternalBlog.g:79:3: (otherlv_0= 'images' otherlv_1= ':' ( (lv_images_2_0= ruleImage ) )+ otherlv_3= 'end' )? (otherlv_4= 'categories' otherlv_5= ':' ( (lv_categories_6_0= ruleCategory ) )+ otherlv_7= 'end' )? ( (lv_site_8_0= ruleSite ) )
            {
            // InternalBlog.g:79:3: (otherlv_0= 'images' otherlv_1= ':' ( (lv_images_2_0= ruleImage ) )+ otherlv_3= 'end' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBlog.g:80:4: otherlv_0= 'images' otherlv_1= ':' ( (lv_images_2_0= ruleImage ) )+ otherlv_3= 'end'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getModelAccess().getImagesKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getModelAccess().getColonKeyword_0_1());
                    			
                    // InternalBlog.g:88:4: ( (lv_images_2_0= ruleImage ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalBlog.g:89:5: (lv_images_2_0= ruleImage )
                    	    {
                    	    // InternalBlog.g:89:5: (lv_images_2_0= ruleImage )
                    	    // InternalBlog.g:90:6: lv_images_2_0= ruleImage
                    	    {

                    	    						newCompositeNode(grammarAccess.getModelAccess().getImagesImageParserRuleCall_0_2_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_images_2_0=ruleImage();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"images",
                    	    							lv_images_2_0,
                    	    							"org.xtext.example.blog.Blog.Image");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);

                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getModelAccess().getEndKeyword_0_3());
                    			

                    }
                    break;

            }

            // InternalBlog.g:112:3: (otherlv_4= 'categories' otherlv_5= ':' ( (lv_categories_6_0= ruleCategory ) )+ otherlv_7= 'end' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBlog.g:113:4: otherlv_4= 'categories' otherlv_5= ':' ( (lv_categories_6_0= ruleCategory ) )+ otherlv_7= 'end'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getCategoriesKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getModelAccess().getColonKeyword_1_1());
                    			
                    // InternalBlog.g:121:4: ( (lv_categories_6_0= ruleCategory ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalBlog.g:122:5: (lv_categories_6_0= ruleCategory )
                    	    {
                    	    // InternalBlog.g:122:5: (lv_categories_6_0= ruleCategory )
                    	    // InternalBlog.g:123:6: lv_categories_6_0= ruleCategory
                    	    {

                    	    						newCompositeNode(grammarAccess.getModelAccess().getCategoriesCategoryParserRuleCall_1_2_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_categories_6_0=ruleCategory();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"categories",
                    	    							lv_categories_6_0,
                    	    							"org.xtext.example.blog.Blog.Category");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    otherlv_7=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getModelAccess().getEndKeyword_1_3());
                    			

                    }
                    break;

            }

            // InternalBlog.g:145:3: ( (lv_site_8_0= ruleSite ) )
            // InternalBlog.g:146:4: (lv_site_8_0= ruleSite )
            {
            // InternalBlog.g:146:4: (lv_site_8_0= ruleSite )
            // InternalBlog.g:147:5: lv_site_8_0= ruleSite
            {

            					newCompositeNode(grammarAccess.getModelAccess().getSiteSiteParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_site_8_0=ruleSite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"site",
            						lv_site_8_0,
            						"org.xtext.example.blog.Blog.Site");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImage"
    // InternalBlog.g:168:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalBlog.g:168:46: (iv_ruleImage= ruleImage EOF )
            // InternalBlog.g:169:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // InternalBlog.g:175:1: ruleImage returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_url_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBlog.g:181:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // InternalBlog.g:182:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // InternalBlog.g:182:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // InternalBlog.g:183:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_url_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            // InternalBlog.g:183:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBlog.g:184:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBlog.g:184:4: (lv_name_0_0= RULE_ID )
            // InternalBlog.g:185:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_0_0, grammarAccess.getImageAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getImageAccess().getColonKeyword_1());
            		
            // InternalBlog.g:205:3: ( (lv_url_2_0= RULE_STRING ) )
            // InternalBlog.g:206:4: (lv_url_2_0= RULE_STRING )
            {
            // InternalBlog.g:206:4: (lv_url_2_0= RULE_STRING )
            // InternalBlog.g:207:5: lv_url_2_0= RULE_STRING
            {
            lv_url_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_url_2_0, grammarAccess.getImageAccess().getUrlSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getImageAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleCategory"
    // InternalBlog.g:231:1: entryRuleCategory returns [EObject current=null] : iv_ruleCategory= ruleCategory EOF ;
    public final EObject entryRuleCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategory = null;


        try {
            // InternalBlog.g:231:49: (iv_ruleCategory= ruleCategory EOF )
            // InternalBlog.g:232:2: iv_ruleCategory= ruleCategory EOF
            {
             newCompositeNode(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCategory=ruleCategory();

            state._fsp--;

             current =iv_ruleCategory; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCategory"


    // $ANTLR start "ruleCategory"
    // InternalBlog.g:238:1: ruleCategory returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ';' ) ;
    public final EObject ruleCategory() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBlog.g:244:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ';' ) )
            // InternalBlog.g:245:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ';' )
            {
            // InternalBlog.g:245:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ';' )
            // InternalBlog.g:246:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ';'
            {
            // InternalBlog.g:246:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBlog.g:247:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBlog.g:247:4: (lv_name_0_0= RULE_ID )
            // InternalBlog.g:248:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCategoryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCategoryAccess().getSemicolonKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleSite"
    // InternalBlog.g:272:1: entryRuleSite returns [EObject current=null] : iv_ruleSite= ruleSite EOF ;
    public final EObject entryRuleSite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSite = null;


        try {
            // InternalBlog.g:272:45: (iv_ruleSite= ruleSite EOF )
            // InternalBlog.g:273:2: iv_ruleSite= ruleSite EOF
            {
             newCompositeNode(grammarAccess.getSiteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSite=ruleSite();

            state._fsp--;

             current =iv_ruleSite; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSite"


    // $ANTLR start "ruleSite"
    // InternalBlog.g:279:1: ruleSite returns [EObject current=null] : (otherlv_0= 'site' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ';' ( ( (lv_hasNavbar_7_0= 'has_navbar' ) ) otherlv_8= ';' )? (otherlv_9= 'icon' otherlv_10= ':' ( (lv_iconUrl_11_0= RULE_STRING ) ) otherlv_12= ';' )? (otherlv_13= 'pages' otherlv_14= ':' ( (lv_pages_15_0= rulePage ) )+ otherlv_16= 'end' )? otherlv_17= 'end' ) ;
    public final EObject ruleSite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token lv_hasNavbar_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_iconUrl_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_pages_15_0 = null;



        	enterRule();

        try {
            // InternalBlog.g:285:2: ( (otherlv_0= 'site' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ';' ( ( (lv_hasNavbar_7_0= 'has_navbar' ) ) otherlv_8= ';' )? (otherlv_9= 'icon' otherlv_10= ':' ( (lv_iconUrl_11_0= RULE_STRING ) ) otherlv_12= ';' )? (otherlv_13= 'pages' otherlv_14= ':' ( (lv_pages_15_0= rulePage ) )+ otherlv_16= 'end' )? otherlv_17= 'end' ) )
            // InternalBlog.g:286:2: (otherlv_0= 'site' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ';' ( ( (lv_hasNavbar_7_0= 'has_navbar' ) ) otherlv_8= ';' )? (otherlv_9= 'icon' otherlv_10= ':' ( (lv_iconUrl_11_0= RULE_STRING ) ) otherlv_12= ';' )? (otherlv_13= 'pages' otherlv_14= ':' ( (lv_pages_15_0= rulePage ) )+ otherlv_16= 'end' )? otherlv_17= 'end' )
            {
            // InternalBlog.g:286:2: (otherlv_0= 'site' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ';' ( ( (lv_hasNavbar_7_0= 'has_navbar' ) ) otherlv_8= ';' )? (otherlv_9= 'icon' otherlv_10= ':' ( (lv_iconUrl_11_0= RULE_STRING ) ) otherlv_12= ';' )? (otherlv_13= 'pages' otherlv_14= ':' ( (lv_pages_15_0= rulePage ) )+ otherlv_16= 'end' )? otherlv_17= 'end' )
            // InternalBlog.g:287:3: otherlv_0= 'site' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ';' ( ( (lv_hasNavbar_7_0= 'has_navbar' ) ) otherlv_8= ';' )? (otherlv_9= 'icon' otherlv_10= ':' ( (lv_iconUrl_11_0= RULE_STRING ) ) otherlv_12= ';' )? (otherlv_13= 'pages' otherlv_14= ':' ( (lv_pages_15_0= rulePage ) )+ otherlv_16= 'end' )? otherlv_17= 'end'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSiteAccess().getSiteKeyword_0());
            		
            // InternalBlog.g:291:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBlog.g:292:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBlog.g:292:4: (lv_name_1_0= RULE_STRING )
            // InternalBlog.g:293:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSiteAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSiteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSiteAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getSiteAccess().getDescriptionKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getSiteAccess().getColonKeyword_4());
            		
            // InternalBlog.g:321:3: ( (lv_description_5_0= RULE_STRING ) )
            // InternalBlog.g:322:4: (lv_description_5_0= RULE_STRING )
            {
            // InternalBlog.g:322:4: (lv_description_5_0= RULE_STRING )
            // InternalBlog.g:323:5: lv_description_5_0= RULE_STRING
            {
            lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_description_5_0, grammarAccess.getSiteAccess().getDescriptionSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSiteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getSiteAccess().getSemicolonKeyword_6());
            		
            // InternalBlog.g:343:3: ( ( (lv_hasNavbar_7_0= 'has_navbar' ) ) otherlv_8= ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBlog.g:344:4: ( (lv_hasNavbar_7_0= 'has_navbar' ) ) otherlv_8= ';'
                    {
                    // InternalBlog.g:344:4: ( (lv_hasNavbar_7_0= 'has_navbar' ) )
                    // InternalBlog.g:345:5: (lv_hasNavbar_7_0= 'has_navbar' )
                    {
                    // InternalBlog.g:345:5: (lv_hasNavbar_7_0= 'has_navbar' )
                    // InternalBlog.g:346:6: lv_hasNavbar_7_0= 'has_navbar'
                    {
                    lv_hasNavbar_7_0=(Token)match(input,18,FOLLOW_8); 

                    						newLeafNode(lv_hasNavbar_7_0, grammarAccess.getSiteAccess().getHasNavbarHas_navbarKeyword_7_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSiteRule());
                    						}
                    						setWithLastConsumed(current, "hasNavbar", lv_hasNavbar_7_0 != null, "has_navbar");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getSiteAccess().getSemicolonKeyword_7_1());
                    			

                    }
                    break;

            }

            // InternalBlog.g:363:3: (otherlv_9= 'icon' otherlv_10= ':' ( (lv_iconUrl_11_0= RULE_STRING ) ) otherlv_12= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBlog.g:364:4: otherlv_9= 'icon' otherlv_10= ':' ( (lv_iconUrl_11_0= RULE_STRING ) ) otherlv_12= ';'
                    {
                    otherlv_9=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getSiteAccess().getIconKeyword_8_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_10, grammarAccess.getSiteAccess().getColonKeyword_8_1());
                    			
                    // InternalBlog.g:372:4: ( (lv_iconUrl_11_0= RULE_STRING ) )
                    // InternalBlog.g:373:5: (lv_iconUrl_11_0= RULE_STRING )
                    {
                    // InternalBlog.g:373:5: (lv_iconUrl_11_0= RULE_STRING )
                    // InternalBlog.g:374:6: lv_iconUrl_11_0= RULE_STRING
                    {
                    lv_iconUrl_11_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_iconUrl_11_0, grammarAccess.getSiteAccess().getIconUrlSTRINGTerminalRuleCall_8_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSiteRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"iconUrl",
                    							lv_iconUrl_11_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getSiteAccess().getSemicolonKeyword_8_3());
                    			

                    }
                    break;

            }

            // InternalBlog.g:395:3: (otherlv_13= 'pages' otherlv_14= ':' ( (lv_pages_15_0= rulePage ) )+ otherlv_16= 'end' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBlog.g:396:4: otherlv_13= 'pages' otherlv_14= ':' ( (lv_pages_15_0= rulePage ) )+ otherlv_16= 'end'
                    {
                    otherlv_13=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getSiteAccess().getPagesKeyword_9_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_14, grammarAccess.getSiteAccess().getColonKeyword_9_1());
                    			
                    // InternalBlog.g:404:4: ( (lv_pages_15_0= rulePage ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==21) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalBlog.g:405:5: (lv_pages_15_0= rulePage )
                    	    {
                    	    // InternalBlog.g:405:5: (lv_pages_15_0= rulePage )
                    	    // InternalBlog.g:406:6: lv_pages_15_0= rulePage
                    	    {

                    	    						newCompositeNode(grammarAccess.getSiteAccess().getPagesPageParserRuleCall_9_2_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_pages_15_0=rulePage();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSiteRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"pages",
                    	    							lv_pages_15_0,
                    	    							"org.xtext.example.blog.Blog.Page");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    otherlv_16=(Token)match(input,13,FOLLOW_15); 

                    				newLeafNode(otherlv_16, grammarAccess.getSiteAccess().getEndKeyword_9_3());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getSiteAccess().getEndKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSite"


    // $ANTLR start "entryRulePage"
    // InternalBlog.g:436:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // InternalBlog.g:436:45: (iv_rulePage= rulePage EOF )
            // InternalBlog.g:437:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // InternalBlog.g:443:1: rulePage returns [EObject current=null] : (otherlv_0= 'page' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ';' (otherlv_7= 'categories' otherlv_8= ':' otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']' otherlv_14= ';' )? (otherlv_15= 'sections' otherlv_16= ':' ( (lv_sections_17_0= ruleSection ) )+ otherlv_18= 'end' )? otherlv_19= 'end' ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_sections_17_0 = null;



        	enterRule();

        try {
            // InternalBlog.g:449:2: ( (otherlv_0= 'page' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ';' (otherlv_7= 'categories' otherlv_8= ':' otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']' otherlv_14= ';' )? (otherlv_15= 'sections' otherlv_16= ':' ( (lv_sections_17_0= ruleSection ) )+ otherlv_18= 'end' )? otherlv_19= 'end' ) )
            // InternalBlog.g:450:2: (otherlv_0= 'page' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ';' (otherlv_7= 'categories' otherlv_8= ':' otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']' otherlv_14= ';' )? (otherlv_15= 'sections' otherlv_16= ':' ( (lv_sections_17_0= ruleSection ) )+ otherlv_18= 'end' )? otherlv_19= 'end' )
            {
            // InternalBlog.g:450:2: (otherlv_0= 'page' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ';' (otherlv_7= 'categories' otherlv_8= ':' otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']' otherlv_14= ';' )? (otherlv_15= 'sections' otherlv_16= ':' ( (lv_sections_17_0= ruleSection ) )+ otherlv_18= 'end' )? otherlv_19= 'end' )
            // InternalBlog.g:451:3: otherlv_0= 'page' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) ) otherlv_6= ';' (otherlv_7= 'categories' otherlv_8= ':' otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']' otherlv_14= ';' )? (otherlv_15= 'sections' otherlv_16= ':' ( (lv_sections_17_0= ruleSection ) )+ otherlv_18= 'end' )? otherlv_19= 'end'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
            		
            // InternalBlog.g:455:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBlog.g:456:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBlog.g:456:4: (lv_name_1_0= RULE_STRING )
            // InternalBlog.g:457:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPageAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getPageAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPageAccess().getDescriptionKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getPageAccess().getColonKeyword_4());
            		
            // InternalBlog.g:485:3: ( (lv_description_5_0= RULE_STRING ) )
            // InternalBlog.g:486:4: (lv_description_5_0= RULE_STRING )
            {
            // InternalBlog.g:486:4: (lv_description_5_0= RULE_STRING )
            // InternalBlog.g:487:5: lv_description_5_0= RULE_STRING
            {
            lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_description_5_0, grammarAccess.getPageAccess().getDescriptionSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getPageAccess().getSemicolonKeyword_6());
            		
            // InternalBlog.g:507:3: (otherlv_7= 'categories' otherlv_8= ':' otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']' otherlv_14= ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBlog.g:508:4: otherlv_7= 'categories' otherlv_8= ':' otherlv_9= '[' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* otherlv_13= ']' otherlv_14= ';'
                    {
                    otherlv_7=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getPageAccess().getCategoriesKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getPageAccess().getColonKeyword_7_1());
                    			
                    otherlv_9=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getPageAccess().getLeftSquareBracketKeyword_7_2());
                    			
                    // InternalBlog.g:520:4: ( (otherlv_10= RULE_ID ) )
                    // InternalBlog.g:521:5: (otherlv_10= RULE_ID )
                    {
                    // InternalBlog.g:521:5: (otherlv_10= RULE_ID )
                    // InternalBlog.g:522:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPageRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_10, grammarAccess.getPageAccess().getCategoriesCategoryCrossReference_7_3_0());
                    					

                    }


                    }

                    // InternalBlog.g:533:4: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==23) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalBlog.g:534:5: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
                    	    {
                    	    otherlv_11=(Token)match(input,23,FOLLOW_4); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getPageAccess().getCommaKeyword_7_4_0());
                    	    				
                    	    // InternalBlog.g:538:5: ( (otherlv_12= RULE_ID ) )
                    	    // InternalBlog.g:539:6: (otherlv_12= RULE_ID )
                    	    {
                    	    // InternalBlog.g:539:6: (otherlv_12= RULE_ID )
                    	    // InternalBlog.g:540:7: otherlv_12= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPageRule());
                    	    							}
                    	    						
                    	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_18); 

                    	    							newLeafNode(otherlv_12, grammarAccess.getPageAccess().getCategoriesCategoryCrossReference_7_4_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,24,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getPageAccess().getRightSquareBracketKeyword_7_5());
                    			
                    otherlv_14=(Token)match(input,15,FOLLOW_19); 

                    				newLeafNode(otherlv_14, grammarAccess.getPageAccess().getSemicolonKeyword_7_6());
                    			

                    }
                    break;

            }

            // InternalBlog.g:561:3: (otherlv_15= 'sections' otherlv_16= ':' ( (lv_sections_17_0= ruleSection ) )+ otherlv_18= 'end' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBlog.g:562:4: otherlv_15= 'sections' otherlv_16= ':' ( (lv_sections_17_0= ruleSection ) )+ otherlv_18= 'end'
                    {
                    otherlv_15=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getPageAccess().getSectionsKeyword_8_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_20); 

                    				newLeafNode(otherlv_16, grammarAccess.getPageAccess().getColonKeyword_8_1());
                    			
                    // InternalBlog.g:570:4: ( (lv_sections_17_0= ruleSection ) )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==26) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalBlog.g:571:5: (lv_sections_17_0= ruleSection )
                    	    {
                    	    // InternalBlog.g:571:5: (lv_sections_17_0= ruleSection )
                    	    // InternalBlog.g:572:6: lv_sections_17_0= ruleSection
                    	    {

                    	    						newCompositeNode(grammarAccess.getPageAccess().getSectionsSectionParserRuleCall_8_2_0());
                    	    					
                    	    pushFollow(FOLLOW_21);
                    	    lv_sections_17_0=ruleSection();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPageRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"sections",
                    	    							lv_sections_17_0,
                    	    							"org.xtext.example.blog.Blog.Section");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    otherlv_18=(Token)match(input,13,FOLLOW_15); 

                    				newLeafNode(otherlv_18, grammarAccess.getPageAccess().getEndKeyword_8_3());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getPageAccess().getEndKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleSection"
    // InternalBlog.g:602:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalBlog.g:602:48: (iv_ruleSection= ruleSection EOF )
            // InternalBlog.g:603:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalBlog.g:609:1: ruleSection returns [EObject current=null] : (otherlv_0= 'section' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_content_3_0= ruleSectionContent ) )* otherlv_4= 'end' ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_content_3_0 = null;



        	enterRule();

        try {
            // InternalBlog.g:615:2: ( (otherlv_0= 'section' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_content_3_0= ruleSectionContent ) )* otherlv_4= 'end' ) )
            // InternalBlog.g:616:2: (otherlv_0= 'section' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_content_3_0= ruleSectionContent ) )* otherlv_4= 'end' )
            {
            // InternalBlog.g:616:2: (otherlv_0= 'section' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_content_3_0= ruleSectionContent ) )* otherlv_4= 'end' )
            // InternalBlog.g:617:3: otherlv_0= 'section' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_content_3_0= ruleSectionContent ) )* otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSectionAccess().getSectionKeyword_0());
            		
            // InternalBlog.g:621:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalBlog.g:622:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalBlog.g:622:4: (lv_name_1_0= RULE_STRING )
            // InternalBlog.g:623:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSectionAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getSectionAccess().getColonKeyword_2());
            		
            // InternalBlog.g:643:3: ( (lv_content_3_0= ruleSectionContent ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=27 && LA13_0<=28)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBlog.g:644:4: (lv_content_3_0= ruleSectionContent )
            	    {
            	    // InternalBlog.g:644:4: (lv_content_3_0= ruleSectionContent )
            	    // InternalBlog.g:645:5: lv_content_3_0= ruleSectionContent
            	    {

            	    					newCompositeNode(grammarAccess.getSectionAccess().getContentSectionContentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_content_3_0=ruleSectionContent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSectionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"content",
            	    						lv_content_3_0,
            	    						"org.xtext.example.blog.Blog.SectionContent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSectionAccess().getEndKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleSectionContent"
    // InternalBlog.g:670:1: entryRuleSectionContent returns [EObject current=null] : iv_ruleSectionContent= ruleSectionContent EOF ;
    public final EObject entryRuleSectionContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSectionContent = null;


        try {
            // InternalBlog.g:670:55: (iv_ruleSectionContent= ruleSectionContent EOF )
            // InternalBlog.g:671:2: iv_ruleSectionContent= ruleSectionContent EOF
            {
             newCompositeNode(grammarAccess.getSectionContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSectionContent=ruleSectionContent();

            state._fsp--;

             current =iv_ruleSectionContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSectionContent"


    // $ANTLR start "ruleSectionContent"
    // InternalBlog.g:677:1: ruleSectionContent returns [EObject current=null] : (this_ParagraphContent_0= ruleParagraphContent | this_ImageContent_1= ruleImageContent ) ;
    public final EObject ruleSectionContent() throws RecognitionException {
        EObject current = null;

        EObject this_ParagraphContent_0 = null;

        EObject this_ImageContent_1 = null;



        	enterRule();

        try {
            // InternalBlog.g:683:2: ( (this_ParagraphContent_0= ruleParagraphContent | this_ImageContent_1= ruleImageContent ) )
            // InternalBlog.g:684:2: (this_ParagraphContent_0= ruleParagraphContent | this_ImageContent_1= ruleImageContent )
            {
            // InternalBlog.g:684:2: (this_ParagraphContent_0= ruleParagraphContent | this_ImageContent_1= ruleImageContent )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            else if ( (LA14_0==28) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalBlog.g:685:3: this_ParagraphContent_0= ruleParagraphContent
                    {

                    			newCompositeNode(grammarAccess.getSectionContentAccess().getParagraphContentParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParagraphContent_0=ruleParagraphContent();

                    state._fsp--;


                    			current = this_ParagraphContent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBlog.g:694:3: this_ImageContent_1= ruleImageContent
                    {

                    			newCompositeNode(grammarAccess.getSectionContentAccess().getImageContentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImageContent_1=ruleImageContent();

                    state._fsp--;


                    			current = this_ImageContent_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSectionContent"


    // $ANTLR start "entryRuleParagraphContent"
    // InternalBlog.g:706:1: entryRuleParagraphContent returns [EObject current=null] : iv_ruleParagraphContent= ruleParagraphContent EOF ;
    public final EObject entryRuleParagraphContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagraphContent = null;


        try {
            // InternalBlog.g:706:57: (iv_ruleParagraphContent= ruleParagraphContent EOF )
            // InternalBlog.g:707:2: iv_ruleParagraphContent= ruleParagraphContent EOF
            {
             newCompositeNode(grammarAccess.getParagraphContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParagraphContent=ruleParagraphContent();

            state._fsp--;

             current =iv_ruleParagraphContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParagraphContent"


    // $ANTLR start "ruleParagraphContent"
    // InternalBlog.g:713:1: ruleParagraphContent returns [EObject current=null] : (otherlv_0= 'paragraph' otherlv_1= ':' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleParagraphContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBlog.g:719:2: ( (otherlv_0= 'paragraph' otherlv_1= ':' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // InternalBlog.g:720:2: (otherlv_0= 'paragraph' otherlv_1= ':' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // InternalBlog.g:720:2: (otherlv_0= 'paragraph' otherlv_1= ':' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // InternalBlog.g:721:3: otherlv_0= 'paragraph' otherlv_1= ':' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParagraphContentAccess().getParagraphKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getParagraphContentAccess().getColonKeyword_1());
            		
            // InternalBlog.g:729:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalBlog.g:730:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalBlog.g:730:4: (lv_content_2_0= RULE_STRING )
            // InternalBlog.g:731:5: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_content_2_0, grammarAccess.getParagraphContentAccess().getContentSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParagraphContentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getParagraphContentAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParagraphContent"


    // $ANTLR start "entryRuleImageContent"
    // InternalBlog.g:755:1: entryRuleImageContent returns [EObject current=null] : iv_ruleImageContent= ruleImageContent EOF ;
    public final EObject entryRuleImageContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageContent = null;


        try {
            // InternalBlog.g:755:53: (iv_ruleImageContent= ruleImageContent EOF )
            // InternalBlog.g:756:2: iv_ruleImageContent= ruleImageContent EOF
            {
             newCompositeNode(grammarAccess.getImageContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImageContent=ruleImageContent();

            state._fsp--;

             current =iv_ruleImageContent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImageContent"


    // $ANTLR start "ruleImageContent"
    // InternalBlog.g:762:1: ruleImageContent returns [EObject current=null] : (otherlv_0= 'image' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleImageContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBlog.g:768:2: ( (otherlv_0= 'image' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalBlog.g:769:2: (otherlv_0= 'image' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalBlog.g:769:2: (otherlv_0= 'image' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';' )
            // InternalBlog.g:770:3: otherlv_0= 'image' otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImageContentAccess().getImageKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getImageContentAccess().getColonKeyword_1());
            		
            // InternalBlog.g:778:3: ( (otherlv_2= RULE_ID ) )
            // InternalBlog.g:779:4: (otherlv_2= RULE_ID )
            {
            // InternalBlog.g:779:4: (otherlv_2= RULE_ID )
            // InternalBlog.g:780:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageContentRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_2, grammarAccess.getImageContentAccess().getImageImageCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getImageContentAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImageContent"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001C2000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000182000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002006000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000018002000L});

}