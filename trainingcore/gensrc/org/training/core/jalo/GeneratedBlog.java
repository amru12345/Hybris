/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 28-Nov-2023, 12:18:01 pm                    ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;
import org.training.core.jalo.Post;

/**
 * Generated class for type {@link org.training.core.jalo.Blog Blog}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedBlog extends GenericItem
{
	/** Qualifier of the <code>Blog.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Blog.active</code> attribute **/
	public static final String ACTIVE = "active";
	/** Qualifier of the <code>Blog.authotr</code> attribute **/
	public static final String AUTHOTR = "authotr";
	/** Qualifier of the <code>Blog.posts</code> attribute **/
	public static final String POSTS = "posts";
	/**
	* {@link OneToManyHandler} for handling 1:n POSTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Post> POSTSHANDLER = new OneToManyHandler<Post>(
	TrainingCoreConstants.TC.POST,
	false,
	"blog",
	"blogPOS",
	true,
	true,
	CollectionType.LIST
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(ACTIVE, AttributeMode.INITIAL);
		tmp.put(AUTHOTR, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Blog.active</code> attribute.
	 * @return the active
	 */
	public Boolean isActive(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedBlog.isActive requires a session language", 0 );
		}
		return (Boolean)getLocalizedProperty( ctx, ACTIVE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Blog.active</code> attribute.
	 * @return the active
	 */
	public Boolean isActive()
	{
		return isActive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Blog.active</code> attribute. 
	 * @return the active
	 */
	public boolean isActiveAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isActive( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Blog.active</code> attribute. 
	 * @return the active
	 */
	public boolean isActiveAsPrimitive()
	{
		return isActiveAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Blog.active</code> attribute. 
	 * @return the localized active
	 */
	public Map<Language,Boolean> getAllActive(final SessionContext ctx)
	{
		return (Map<Language,Boolean>)getAllLocalizedProperties(ctx,ACTIVE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Blog.active</code> attribute. 
	 * @return the localized active
	 */
	public Map<Language,Boolean> getAllActive()
	{
		return getAllActive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Blog.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final SessionContext ctx, final Boolean value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedBlog.setActive requires a session language", 0 );
		}
		setLocalizedProperty(ctx, ACTIVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Blog.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final Boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Blog.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final SessionContext ctx, final boolean value)
	{
		setActive( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Blog.active</code> attribute. 
	 * @param value the active
	 */
	public void setActive(final boolean value)
	{
		setActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Blog.active</code> attribute. 
	 * @param value the active
	 */
	public void setAllActive(final SessionContext ctx, final Map<Language,Boolean> value)
	{
		setAllLocalizedProperties(ctx,ACTIVE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Blog.active</code> attribute. 
	 * @param value the active
	 */
	public void setAllActive(final Map<Language,Boolean> value)
	{
		setAllActive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Blog.authotr</code> attribute.
	 * @return the authotr
	 */
	public String getAuthotr(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AUTHOTR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Blog.authotr</code> attribute.
	 * @return the authotr
	 */
	public String getAuthotr()
	{
		return getAuthotr( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Blog.authotr</code> attribute. 
	 * @param value the authotr
	 */
	public void setAuthotr(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AUTHOTR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Blog.authotr</code> attribute. 
	 * @param value the authotr
	 */
	public void setAuthotr(final String value)
	{
		setAuthotr( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Blog.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedBlog.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Blog.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Blog.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Blog.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Blog.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		if( ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedBlog.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Blog.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Blog.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Blog.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Blog.posts</code> attribute.
	 * @return the posts
	 */
	public List<Post> getPosts(final SessionContext ctx)
	{
		return (List<Post>)POSTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Blog.posts</code> attribute.
	 * @return the posts
	 */
	public List<Post> getPosts()
	{
		return getPosts( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Blog.posts</code> attribute. 
	 * @param value the posts
	 */
	public void setPosts(final SessionContext ctx, final List<Post> value)
	{
		POSTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Blog.posts</code> attribute. 
	 * @param value the posts
	 */
	public void setPosts(final List<Post> value)
	{
		setPosts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to posts. 
	 * @param value the item to add to posts
	 */
	public void addToPosts(final SessionContext ctx, final Post value)
	{
		POSTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to posts. 
	 * @param value the item to add to posts
	 */
	public void addToPosts(final Post value)
	{
		addToPosts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from posts. 
	 * @param value the item to remove from posts
	 */
	public void removeFromPosts(final SessionContext ctx, final Post value)
	{
		POSTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from posts. 
	 * @param value the item to remove from posts
	 */
	public void removeFromPosts(final Post value)
	{
		removeFromPosts( getSession().getSessionContext(), value );
	}
	
}
