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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;
import org.training.core.jalo.Post;

/**
 * Generated class for type {@link org.training.core.jalo.Postcomment PostComment}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedPostcomment extends GenericItem
{
	/** Qualifier of the <code>PostComment.author</code> attribute **/
	public static final String AUTHOR = "author";
	/** Qualifier of the <code>PostComment.content</code> attribute **/
	public static final String CONTENT = "content";
	/** Qualifier of the <code>PostComment.postsPOS</code> attribute **/
	public static final String POSTSPOS = "postsPOS";
	/** Qualifier of the <code>PostComment.posts</code> attribute **/
	public static final String POSTS = "posts";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n POSTS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPostcomment> POSTSHANDLER = new BidirectionalOneToManyHandler<GeneratedPostcomment>(
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
		tmp.put(AUTHOR, AttributeMode.INITIAL);
		tmp.put(CONTENT, AttributeMode.INITIAL);
		tmp.put(POSTSPOS, AttributeMode.INITIAL);
		tmp.put(POSTS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PostComment.author</code> attribute.
	 * @return the author
	 */
	public String getAuthor(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPostcomment.getAuthor requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, AUTHOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PostComment.author</code> attribute.
	 * @return the author
	 */
	public String getAuthor()
	{
		return getAuthor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PostComment.author</code> attribute. 
	 * @return the localized author
	 */
	public Map<Language,String> getAllAuthor(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,AUTHOR,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PostComment.author</code> attribute. 
	 * @return the localized author
	 */
	public Map<Language,String> getAllAuthor()
	{
		return getAllAuthor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PostComment.author</code> attribute. 
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
			throw new JaloInvalidParameterException("GeneratedPostcomment.setAuthor requires a session language", 0 );
		}
		setLocalizedProperty(ctx, AUTHOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PostComment.author</code> attribute. 
	 * @param value the author
	 */
	public void setAuthor(final String value)
	{
		setAuthor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PostComment.author</code> attribute. 
	 * @param value the author
	 */
	public void setAllAuthor(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,AUTHOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PostComment.author</code> attribute. 
	 * @param value the author
	 */
	public void setAllAuthor(final Map<Language,String> value)
	{
		setAllAuthor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PostComment.content</code> attribute.
	 * @return the content
	 */
	public String getContent(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedPostcomment.getContent requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, CONTENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PostComment.content</code> attribute.
	 * @return the content
	 */
	public String getContent()
	{
		return getContent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PostComment.content</code> attribute. 
	 * @return the localized content
	 */
	public Map<Language,String> getAllContent(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,CONTENT,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PostComment.content</code> attribute. 
	 * @return the localized content
	 */
	public Map<Language,String> getAllContent()
	{
		return getAllContent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PostComment.content</code> attribute. 
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
			throw new JaloInvalidParameterException("GeneratedPostcomment.setContent requires a session language", 0 );
		}
		setLocalizedProperty(ctx, CONTENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PostComment.content</code> attribute. 
	 * @param value the content
	 */
	public void setContent(final String value)
	{
		setContent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PostComment.content</code> attribute. 
	 * @param value the content
	 */
	public void setAllContent(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,CONTENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PostComment.content</code> attribute. 
	 * @param value the content
	 */
	public void setAllContent(final Map<Language,String> value)
	{
		setAllContent( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		POSTSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PostComment.posts</code> attribute.
	 * @return the posts
	 */
	public Post getPosts(final SessionContext ctx)
	{
		return (Post)getProperty( ctx, POSTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PostComment.posts</code> attribute.
	 * @return the posts
	 */
	public Post getPosts()
	{
		return getPosts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PostComment.posts</code> attribute. 
	 * @param value the posts
	 */
	public void setPosts(final SessionContext ctx, final Post value)
	{
		POSTSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PostComment.posts</code> attribute. 
	 * @param value the posts
	 */
	public void setPosts(final Post value)
	{
		setPosts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PostComment.postsPOS</code> attribute.
	 * @return the postsPOS
	 */
	 Integer getPostsPOS(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, POSTSPOS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PostComment.postsPOS</code> attribute.
	 * @return the postsPOS
	 */
	 Integer getPostsPOS()
	{
		return getPostsPOS( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PostComment.postsPOS</code> attribute. 
	 * @return the postsPOS
	 */
	 int getPostsPOSAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPostsPOS( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PostComment.postsPOS</code> attribute. 
	 * @return the postsPOS
	 */
	 int getPostsPOSAsPrimitive()
	{
		return getPostsPOSAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PostComment.postsPOS</code> attribute. 
	 * @param value the postsPOS
	 */
	 void setPostsPOS(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, POSTSPOS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PostComment.postsPOS</code> attribute. 
	 * @param value the postsPOS
	 */
	 void setPostsPOS(final Integer value)
	{
		setPostsPOS( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PostComment.postsPOS</code> attribute. 
	 * @param value the postsPOS
	 */
	 void setPostsPOS(final SessionContext ctx, final int value)
	{
		setPostsPOS( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PostComment.postsPOS</code> attribute. 
	 * @param value the postsPOS
	 */
	 void setPostsPOS(final int value)
	{
		setPostsPOS( getSession().getSessionContext(), value );
	}
	
}
