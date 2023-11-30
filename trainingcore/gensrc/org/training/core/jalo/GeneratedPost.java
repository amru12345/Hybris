/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 28-Nov-2023, 12:18:01 pm                    ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;
import org.training.core.jalo.Blog;
import org.training.core.jalo.Postcomment;

/**
 * Generated class for type {@link org.training.core.jalo.Post Post}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedPost extends GenericItem
{
	/** Qualifier of the <code>Post.date</code> attribute **/
	public static final String DATE = "date";
	/** Qualifier of the <code>Post.author</code> attribute **/
	public static final String AUTHOR = "author";
	/** Qualifier of the <code>Post.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>Post.content</code> attribute **/
	public static final String CONTENT = "content";
	/** Qualifier of the <code>Post.keywords</code> attribute **/
	public static final String KEYWORDS = "keywords";
	/** Qualifier of the <code>Post.blogPOS</code> attribute **/
	public static final String BLOGPOS = "blogPOS";
	/** Qualifier of the <code>Post.blog</code> attribute **/
	public static final String BLOG = "blog";
	/** Qualifier of the <code>Post.postcomments</code> attribute **/
	public static final String POSTCOMMENTS = "postcomments";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n BLOG's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPost> BLOGHANDLER = new BidirectionalOneToManyHandler<GeneratedPost>(
	TrainingCoreConstants.TC.POST,
	false,
	"blog",
	"blogPOS",
	true,
	true,
	CollectionType.LIST
	);
	/**
	* {@link OneToManyHandler} for handling 1:n POSTCOMMENTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Postcomment> POSTCOMMENTSHANDLER = new OneToManyHandler<Postcomment>(
	TrainingCoreConstants.TC.POSTCOMMENT,
	false,
	"posts",
	"postsPOS",
	true,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DATE, AttributeMode.INITIAL);
		tmp.put(AUTHOR, AttributeMode.INITIAL);
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(CONTENT, AttributeMode.INITIAL);
		tmp.put(KEYWORDS, AttributeMode.INITIAL);
		tmp.put(BLOGPOS, AttributeMode.INITIAL);
		tmp.put(BLOG, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.author</code> attribute.
	 * @return the author
	 */
	public String getAuthor(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPost.getAuthor requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, AUTHOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.author</code> attribute.
	 * @return the author
	 */
	public String getAuthor()
	{
		return getAuthor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.author</code> attribute. 
	 * @return the localized author
	 */
	public Map<Language,String> getAllAuthor(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,AUTHOR,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.author</code> attribute. 
	 * @return the localized author
	 */
	public Map<Language,String> getAllAuthor()
	{
		return getAllAuthor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.author</code> attribute. 
	 * @param value the author
	 */
	public void setAuthor(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPost.setAuthor requires a session language", 0 );
		}
		setLocalizedProperty(ctx, AUTHOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.author</code> attribute. 
	 * @param value the author
	 */
	public void setAuthor(final String value)
	{
		setAuthor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.author</code> attribute. 
	 * @param value the author
	 */
	public void setAllAuthor(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,AUTHOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.author</code> attribute. 
	 * @param value the author
	 */
	public void setAllAuthor(final Map<Language,String> value)
	{
		setAllAuthor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.blog</code> attribute.
	 * @return the blog
	 */
	public Blog getBlog(final SessionContext ctx)
	{
		return (Blog)getProperty( ctx, BLOG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.blog</code> attribute.
	 * @return the blog
	 */
	public Blog getBlog()
	{
		return getBlog( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.blog</code> attribute. 
	 * @param value the blog
	 */
	public void setBlog(final SessionContext ctx, final Blog value)
	{
		BLOGHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.blog</code> attribute. 
	 * @param value the blog
	 */
	public void setBlog(final Blog value)
	{
		setBlog( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.blogPOS</code> attribute.
	 * @return the blogPOS
	 */
	 Integer getBlogPOS(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, BLOGPOS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.blogPOS</code> attribute.
	 * @return the blogPOS
	 */
	 Integer getBlogPOS()
	{
		return getBlogPOS( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.blogPOS</code> attribute. 
	 * @return the blogPOS
	 */
	 int getBlogPOSAsPrimitive(final SessionContext ctx)
	{
		Integer value = getBlogPOS( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.blogPOS</code> attribute. 
	 * @return the blogPOS
	 */
	 int getBlogPOSAsPrimitive()
	{
		return getBlogPOSAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.blogPOS</code> attribute. 
	 * @param value the blogPOS
	 */
	 void setBlogPOS(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, BLOGPOS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.blogPOS</code> attribute. 
	 * @param value the blogPOS
	 */
	 void setBlogPOS(final Integer value)
	{
		setBlogPOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.blogPOS</code> attribute. 
	 * @param value the blogPOS
	 */
	 void setBlogPOS(final SessionContext ctx, final int value)
	{
		setBlogPOS( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.blogPOS</code> attribute. 
	 * @param value the blogPOS
	 */
	 void setBlogPOS(final int value)
	{
		setBlogPOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.content</code> attribute.
	 * @return the content
	 */
	public String getContent(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPost.getContent requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, CONTENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.content</code> attribute.
	 * @return the content
	 */
	public String getContent()
	{
		return getContent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.content</code> attribute. 
	 * @return the localized content
	 */
	public Map<Language,String> getAllContent(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,CONTENT,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.content</code> attribute. 
	 * @return the localized content
	 */
	public Map<Language,String> getAllContent()
	{
		return getAllContent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.content</code> attribute. 
	 * @param value the content
	 */
	public void setContent(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPost.setContent requires a session language", 0 );
		}
		setLocalizedProperty(ctx, CONTENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.content</code> attribute. 
	 * @param value the content
	 */
	public void setContent(final String value)
	{
		setContent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.content</code> attribute. 
	 * @param value the content
	 */
	public void setAllContent(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,CONTENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.content</code> attribute. 
	 * @param value the content
	 */
	public void setAllContent(final Map<Language,String> value)
	{
		setAllContent( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		BLOGHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.date</code> attribute.
	 * @return the date
	 */
	public Date getDate(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPost.getDate requires a session language", 0 );
		}
		return (Date)getLocalizedProperty( ctx, DATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.date</code> attribute.
	 * @return the date
	 */
	public Date getDate()
	{
		return getDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.date</code> attribute. 
	 * @return the localized date
	 */
	public Map<Language,Date> getAllDate(final SessionContext ctx)
	{
		return (Map<Language,Date>)getAllLocalizedProperties(ctx,DATE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.date</code> attribute. 
	 * @return the localized date
	 */
	public Map<Language,Date> getAllDate()
	{
		return getAllDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final SessionContext ctx, final Date value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPost.setDate requires a session language", 0 );
		}
		setLocalizedProperty(ctx, DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.date</code> attribute. 
	 * @param value the date
	 */
	public void setDate(final Date value)
	{
		setDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.date</code> attribute. 
	 * @param value the date
	 */
	public void setAllDate(final SessionContext ctx, final Map<Language,Date> value)
	{
		setAllLocalizedProperties(ctx,DATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.date</code> attribute. 
	 * @param value the date
	 */
	public void setAllDate(final Map<Language,Date> value)
	{
		setAllDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.keywords</code> attribute.
	 * @return the keywords
	 */
	public Character getKeywords(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPost.getKeywords requires a session language", 0 );
		}
		return (Character)getLocalizedProperty( ctx, KEYWORDS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.keywords</code> attribute.
	 * @return the keywords
	 */
	public Character getKeywords()
	{
		return getKeywords( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.keywords</code> attribute. 
	 * @return the keywords
	 */
	public char getKeywordsAsPrimitive(final SessionContext ctx)
	{
		Character value = getKeywords( ctx );
		return value != null ? value.charValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.keywords</code> attribute. 
	 * @return the keywords
	 */
	public char getKeywordsAsPrimitive()
	{
		return getKeywordsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.keywords</code> attribute. 
	 * @return the localized keywords
	 */
	public Map<Language,Character> getAllKeywords(final SessionContext ctx)
	{
		return (Map<Language,Character>)getAllLocalizedProperties(ctx,KEYWORDS,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.keywords</code> attribute. 
	 * @return the localized keywords
	 */
	public Map<Language,Character> getAllKeywords()
	{
		return getAllKeywords( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.keywords</code> attribute. 
	 * @param value the keywords
	 */
	public void setKeywords(final SessionContext ctx, final Character value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPost.setKeywords requires a session language", 0 );
		}
		setLocalizedProperty(ctx, KEYWORDS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.keywords</code> attribute. 
	 * @param value the keywords
	 */
	public void setKeywords(final Character value)
	{
		setKeywords( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.keywords</code> attribute. 
	 * @param value the keywords
	 */
	public void setKeywords(final SessionContext ctx, final char value)
	{
		setKeywords( ctx,Character.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.keywords</code> attribute. 
	 * @param value the keywords
	 */
	public void setKeywords(final char value)
	{
		setKeywords( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.keywords</code> attribute. 
	 * @param value the keywords
	 */
	public void setAllKeywords(final SessionContext ctx, final Map<Language,Character> value)
	{
		setAllLocalizedProperties(ctx,KEYWORDS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.keywords</code> attribute. 
	 * @param value the keywords
	 */
	public void setAllKeywords(final Map<Language,Character> value)
	{
		setAllKeywords( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.postcomments</code> attribute.
	 * @return the postcomments
	 */
	public List<Postcomment> getPostcomments(final SessionContext ctx)
	{
		return (List<Postcomment>)POSTCOMMENTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.postcomments</code> attribute.
	 * @return the postcomments
	 */
	public List<Postcomment> getPostcomments()
	{
		return getPostcomments( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.postcomments</code> attribute. 
	 * @param value the postcomments
	 */
	public void setPostcomments(final SessionContext ctx, final List<Postcomment> value)
	{
		POSTCOMMENTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.postcomments</code> attribute. 
	 * @param value the postcomments
	 */
	public void setPostcomments(final List<Postcomment> value)
	{
		setPostcomments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to postcomments. 
	 * @param value the item to add to postcomments
	 */
	public void addToPostcomments(final SessionContext ctx, final Postcomment value)
	{
		POSTCOMMENTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to postcomments. 
	 * @param value the item to add to postcomments
	 */
	public void addToPostcomments(final Postcomment value)
	{
		addToPostcomments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from postcomments. 
	 * @param value the item to remove from postcomments
	 */
	public void removeFromPostcomments(final SessionContext ctx, final Postcomment value)
	{
		POSTCOMMENTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from postcomments. 
	 * @param value the item to remove from postcomments
	 */
	public void removeFromPostcomments(final Postcomment value)
	{
		removeFromPostcomments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.title</code> attribute.
	 * @return the title
	 */
	public String getTitle(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPost.getTitle requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.title</code> attribute.
	 * @return the title
	 */
	public String getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.title</code> attribute. 
	 * @return the localized title
	 */
	public Map<Language,String> getAllTitle(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,TITLE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Post.title</code> attribute. 
	 * @return the localized title
	 */
	public Map<Language,String> getAllTitle()
	{
		return getAllTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPost.setTitle requires a session language", 0 );
		}
		setLocalizedProperty(ctx, TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final String value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.title</code> attribute. 
	 * @param value the title
	 */
	public void setAllTitle(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Post.title</code> attribute. 
	 * @param value the title
	 */
	public void setAllTitle(final Map<Language,String> value)
	{
		setAllTitle( getSession().getSessionContext(), value );
	}
	
}
