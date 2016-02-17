/**
 * 
 */
package net.rn.clouds.chat.service.impl;

import xdi2.core.syntax.CloudName;
import xdi2.core.syntax.XDIAddress;
import biz.neustar.clouds.chat.model.Connection;

/**
 * @author Noopur Pandey
 *
 */
public class ConnectionImpl implements Connection{
	
	private XDIAddress child1;
	private XDIAddress child2;	
	private boolean isApprovalRequired;
	private boolean isApproved1;	
	private boolean isApproved2;
	private boolean isBlocked1;
	private boolean isBlocked2;
	private CloudName connectionName;
	
	
	public ConnectionImpl(XDIAddress child1, XDIAddress child2, boolean isApprovalRequired, 
			boolean isApproved1, boolean isApproved2, boolean isBlocked1, boolean isBlocked2, CloudName connectionName){
		this.child1 = child1;
		this.child2 = child2;		
		this.isApprovalRequired = isApprovalRequired;
		this.isApproved1 = isApproved1;
		this.isApproved2 = isApproved2;
		this.isBlocked1 = isBlocked1;
		this.isBlocked2 = isBlocked2;
		this.connectionName = connectionName;
	}		
	
	public Boolean isApprovalRequired(){
		return isApprovalRequired;
	}
	
	/* (non-Javadoc)
	 * @see biz.neustar.clouds.chat.model.Connection#getChild1()
	 */
	@Override
	public XDIAddress getChild1(){
		return child1;
	}
	
	/* (non-Javadoc)
	 * @see biz.neustar.clouds.chat.model.Connection#getChild2()
	 */
	@Override
	public XDIAddress getChild2(){
		return child2;
	}
	
	/* (non-Javadoc)
	 * @see biz.neustar.clouds.chat.model.Connection#isApproved1()
	 */
	@Override
	public Boolean isApproved1(){
		return isApproved1;
	}
	
	/* (non-Javadoc)
	 * @see biz.neustar.clouds.chat.model.Connection#isApproved2()
	 */
	@Override
	public Boolean isApproved2(){
		return isApproved2;
	}
	
	/* (non-Javadoc)
	 * @see biz.neustar.clouds.chat.model.Connection#isBlocked1()
	 */
	@Override
	public Boolean isBlocked1(){
		return isBlocked1;
	}
	
	/* (non-Javadoc)
	 * @see biz.neustar.clouds.chat.model.Connection#isBlocked2()
	 */
	@Override
	public Boolean isBlocked2(){
		return isBlocked2;
	}
		
	/* (non-Javadoc)
	 * @see biz.neustar.clouds.chat.model.Connection#getConnectionName()
	 */
	@Override
	public CloudName getConnectionName(){
		return connectionName;
	}
}
