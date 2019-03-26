/**
 * Copyright (c) 2000-2005 Liferay, LLC. All rights reserved.
 *
 * <p>Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * <p>The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * <p>THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.liferay.portlet.admin.model;

import java.io.Serializable;

/**
 * <a href="JournalConfig.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 * @version $Revision: 1.3 $
 */
public class JournalConfig implements Serializable {

  public static final String JOURNAL_CONFIG = "JOURNAL_CONFIG";

  public static final boolean DEFAULT_ALLOW_SIMPLE_ARTICLES = true;

  public JournalConfig() {}

  public JournalConfig(
      boolean allowSimpleArticles,
      EmailConfig approvalRequestedEmail,
      EmailConfig approvalGrantedEmail,
      EmailConfig approvalDeniedEmail) {

    _allowSimpleArticles = allowSimpleArticles;
    _approvalRequestedEmail = approvalRequestedEmail;
    _approvalGrantedEmail = approvalGrantedEmail;
    _approvalDeniedEmail = approvalDeniedEmail;
  }

  public boolean getAllowSimpleArticles() {
    return _allowSimpleArticles;
  }

  public boolean isAllowSimpleArticles() {
    return _allowSimpleArticles;
  }

  public void setAllowSimpleArticles(boolean allowSimpleArticles) {
    _allowSimpleArticles = allowSimpleArticles;
  }

  public EmailConfig getApprovalRequestedEmail() {
    return _approvalRequestedEmail;
  }

  public void setApprovalRequestedEmail(EmailConfig approvalRequestedEmail) {
    _approvalRequestedEmail = approvalRequestedEmail;
  }

  public EmailConfig getApprovalGrantedEmail() {
    return _approvalGrantedEmail;
  }

  public void setApprovalGrantedEmail(EmailConfig approvalGrantedEmail) {
    _approvalGrantedEmail = approvalGrantedEmail;
  }

  public EmailConfig getApprovalDeniedEmail() {
    return _approvalDeniedEmail;
  }

  public void setApprovalDeniedEmail(EmailConfig approvalDeniedEmail) {
    _approvalDeniedEmail = approvalDeniedEmail;
  }

  private boolean _allowSimpleArticles;
  private EmailConfig _approvalRequestedEmail;
  private EmailConfig _approvalGrantedEmail;
  private EmailConfig _approvalDeniedEmail;
}
