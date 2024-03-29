/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package tanger.med.core.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the TMessage service. Represents a row in the &quot;tangermed_TMessage&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link tanger.med.core.model.impl.TMessageModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link tanger.med.core.model.impl.TMessageImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TMessage
 * @see tanger.med.core.model.impl.TMessageImpl
 * @see tanger.med.core.model.impl.TMessageModelImpl
 * @generated
 */
@ProviderType
public interface TMessageModel extends BaseModel<TMessage>, ShardedModel,
	StagedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a t message model instance should use the {@link TMessage} interface instead.
	 */

	/**
	 * Returns the primary key of this t message.
	 *
	 * @return the primary key of this t message
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this t message.
	 *
	 * @param primaryKey the primary key of this t message
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this t message.
	 *
	 * @return the uuid of this t message
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this t message.
	 *
	 * @param uuid the uuid of this t message
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the message ID of this t message.
	 *
	 * @return the message ID of this t message
	 */
	public long getMessageId();

	/**
	 * Sets the message ID of this t message.
	 *
	 * @param messageId the message ID of this t message
	 */
	public void setMessageId(long messageId);

	/**
	 * Returns the group ID of this t message.
	 *
	 * @return the group ID of this t message
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this t message.
	 *
	 * @param groupId the group ID of this t message
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this t message.
	 *
	 * @return the company ID of this t message
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this t message.
	 *
	 * @param companyId the company ID of this t message
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this t message.
	 *
	 * @return the user ID of this t message
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this t message.
	 *
	 * @param userId the user ID of this t message
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this t message.
	 *
	 * @return the user uuid of this t message
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this t message.
	 *
	 * @param userUuid the user uuid of this t message
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the title of this t message.
	 *
	 * @return the title of this t message
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this t message.
	 *
	 * @param title the title of this t message
	 */
	public void setTitle(String title);

	/**
	 * Returns the content of this t message.
	 *
	 * @return the content of this t message
	 */
	@AutoEscape
	public String getContent();

	/**
	 * Sets the content of this t message.
	 *
	 * @param content the content of this t message
	 */
	public void setContent(String content);

	/**
	 * Returns the create date of this t message.
	 *
	 * @return the create date of this t message
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this t message.
	 *
	 * @param createDate the create date of this t message
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this t message.
	 *
	 * @return the modified date of this t message
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this t message.
	 *
	 * @param modifiedDate the modified date of this t message
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(TMessage tMessage);

	@Override
	public int hashCode();

	@Override
	public CacheModel<TMessage> toCacheModel();

	@Override
	public TMessage toEscapedModel();

	@Override
	public TMessage toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}