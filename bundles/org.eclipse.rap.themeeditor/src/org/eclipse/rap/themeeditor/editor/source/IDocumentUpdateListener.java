/*******************************************************************************
 * Copyright (c) 2008 Mathias Schaeffner and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Mathias Schaeffner - initial API and implementation
 *******************************************************************************/
package org.eclipse.rap.themeeditor.editor.source;

/**
 * Listener that is notified when the time has elapsed after a document change
 * event. So now the document change becomes visible to the editor.
 */
public interface IDocumentUpdateListener {

  public void updateDocument();
}