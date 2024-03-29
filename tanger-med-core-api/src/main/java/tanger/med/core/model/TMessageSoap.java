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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link tanger.med.core.service.http.TMessageServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see tanger.med.core.service.http.TMessageServiceSoap
 * @generated
 */
@ProviderType
public class TMessageSoap implements Serializable {
	public static TMessageSoap toSoapModel(TMessage model) {
		TMessageSoap soapModel = new TMessageSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setMessageId(model.getMessageId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setTitle(model.getTitle());
		soapModel.setContent(model.getContent());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static TMessageSoap[] toSoapModels(TMessage[] models) {
		TMessageSoap[] soapModels = new TMessageSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TMessageSoap[][] toSoapModels(TMessage[][] models) {
		TMessageSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TMessageSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TMessageSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TMessageSoap[] toSoapModels(List<TMessage> models) {
		List<TMessageSoap> soapModels = new ArrayList<TMessageSoap>(models.size());

		for (TMessage model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TMessageSoap[soapModels.size()]);
	}

	public TMessageSoap() {
	}

	public long getPrimaryKey() {
		return _messageId;
	}

	public void setPrimaryKey(long pk) {
		setMessageId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getMessageId() {
		return _messageId;
	}

	public void setMessageId(long messageId) {
		_messageId = messageId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getContent() {
		return _content;
	}

	public void setContent(String content) {
		_content = content;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	private String _uuid;
	private long _messageId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _title;
	private String _content;
	private Date _createDate;
	private Date _modifiedDate;
}