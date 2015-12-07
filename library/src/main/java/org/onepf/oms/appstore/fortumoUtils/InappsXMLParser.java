/*
 * Copyright 2012-2014 One Platform Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onepf.oms.appstore.fortumoUtils;

import android.content.Context;
import android.util.Pair;

import android.support.annotation.NonNull;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author akarimova@onepf.org
 * @since 17.02.14
 */
public class InappsXMLParser {
    private static final Pattern countryPattern = Pattern.compile("[A-Z][A-Z]");
    private static final Pattern localePattern = Pattern.compile("[a-z][a-z]_[A-Z][A-Z]");
    private static final Pattern skuPattern = Pattern.compile("([a-z]|[0-9]){1}[a-z0-9._]*");


    //TAGS
    private static final String TAG_INAPP_PRODUCTS = "inapp-products";
    private static final String TAG_SUBSCRIPTIONS = "subscriptions";
    private static final String TAG_SUBSCRIPTION = "subscription";
    private static final String TAG_ITEMS = "items";
    private static final String TAG_ITEM = "item";
    private static final String TAG_SUMMARY = "summary";
    private static final String TAG_SUMMARY_LOCALIZATION = "summary-localization";
    private static final String TAG_SUMMARY_BASE = "summary-base";
    private static final String TAG_PRICE_BASE = "price-base";
    private static final String TAG_PRICE_LOCAL = "price-local";
    private static final String TAG_COMMON_TITLE = "title";
    private static final String TAG_COMMON_DESCRIPTION = "description";
    private static final String TAG_PRICE = "price";

    //ATTRS
    private static final String ATTR_PUBLISH_STATE = "publish-state";
    private static final String ATTR_ID = "id";
    private static final String ATTR_LOCALE = "locale";
    private static final String ATTR_COUNTRY = "country";
    private static final String ATTR_PERIOD = "period";
    private static final String ATTR_AUTOFILL = "autofill";

    private static void inWrongNode(String childTagName, String rightParentTag) {
        throw new IllegalStateException(String.format("%s is not inside %s", childTagName, rightParentTag));
    }

    private static void inWrongNode(String childTagName, String rightParentTag, String otherRightParentTag) {
        throw new IllegalStateException(String.format("%s is not inside %s or %s", childTagName, rightParentTag, otherRightParentTag));
    }
}
