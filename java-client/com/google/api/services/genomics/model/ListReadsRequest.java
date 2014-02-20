/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * Modify at your own risk.
 */

package com.google.api.services.genomics.model;

/**
 * Model definition for ListReadsRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 */
@SuppressWarnings("javadoc")
public final class ListReadsRequest extends com.google.api.client.json.GenericJson {

  /**
   * The list of fields to be returned with this query. Leaving this blank returns all fields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> includeFields;

  /**
   * The continuation token, which is used to page through large result sets. To get the next page
   * of results, set this parameter to the value of "nextPageToken" from the previous response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageToken;

  /**
   * If specified, will restrict this query to reads within the given readsets. At least one dataset
   * ID or a readset ID must be provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> readsetIds;

  /**
   * The end position (1-based, inclusive) of this query. If a sequence name is specified, this
   * defaults to the sequence's length.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger sequenceEnd;

  /**
   * The sequence to query. (e.g. 'X' for the X chromosome) Leaving this blank returns results from
   * all sequences, including unmapped reads.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sequenceName;

  /**
   * The start position (1-based) of this query. If a sequence name is specified, this defaults to
   * 1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger sequenceStart;

  /**
   * The list of fields to be returned with this query. Leaving this blank returns all fields.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIncludeFields() {
    return includeFields;
  }

  /**
   * The list of fields to be returned with this query. Leaving this blank returns all fields.
   * @param includeFields includeFields or {@code null} for none
   */
  public ListReadsRequest setIncludeFields(java.util.List<java.lang.String> includeFields) {
    this.includeFields = includeFields;
    return this;
  }

  /**
   * The continuation token, which is used to page through large result sets. To get the next page
   * of results, set this parameter to the value of "nextPageToken" from the previous response.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageToken() {
    return pageToken;
  }

  /**
   * The continuation token, which is used to page through large result sets. To get the next page
   * of results, set this parameter to the value of "nextPageToken" from the previous response.
   * @param pageToken pageToken or {@code null} for none
   */
  public ListReadsRequest setPageToken(java.lang.String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * If specified, will restrict this query to reads within the given readsets. At least one dataset
   * ID or a readset ID must be provided.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getReadsetIds() {
    return readsetIds;
  }

  /**
   * If specified, will restrict this query to reads within the given readsets. At least one dataset
   * ID or a readset ID must be provided.
   * @param readsetIds readsetIds or {@code null} for none
   */
  public ListReadsRequest setReadsetIds(java.util.List<java.lang.String> readsetIds) {
    this.readsetIds = readsetIds;
    return this;
  }

  /**
   * The end position (1-based, inclusive) of this query. If a sequence name is specified, this
   * defaults to the sequence's length.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getSequenceEnd() {
    return sequenceEnd;
  }

  /**
   * The end position (1-based, inclusive) of this query. If a sequence name is specified, this
   * defaults to the sequence's length.
   * @param sequenceEnd sequenceEnd or {@code null} for none
   */
  public ListReadsRequest setSequenceEnd(java.math.BigInteger sequenceEnd) {
    this.sequenceEnd = sequenceEnd;
    return this;
  }

  /**
   * The sequence to query. (e.g. 'X' for the X chromosome) Leaving this blank returns results from
   * all sequences, including unmapped reads.
   * @return value or {@code null} for none
   */
  public java.lang.String getSequenceName() {
    return sequenceName;
  }

  /**
   * The sequence to query. (e.g. 'X' for the X chromosome) Leaving this blank returns results from
   * all sequences, including unmapped reads.
   * @param sequenceName sequenceName or {@code null} for none
   */
  public ListReadsRequest setSequenceName(java.lang.String sequenceName) {
    this.sequenceName = sequenceName;
    return this;
  }

  /**
   * The start position (1-based) of this query. If a sequence name is specified, this defaults to
   * 1.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getSequenceStart() {
    return sequenceStart;
  }

  /**
   * The start position (1-based) of this query. If a sequence name is specified, this defaults to
   * 1.
   * @param sequenceStart sequenceStart or {@code null} for none
   */
  public ListReadsRequest setSequenceStart(java.math.BigInteger sequenceStart) {
    this.sequenceStart = sequenceStart;
    return this;
  }

  @Override
  public ListReadsRequest set(String fieldName, Object value) {
    return (ListReadsRequest) super.set(fieldName, value);
  }

  @Override
  public ListReadsRequest clone() {
    return (ListReadsRequest) super.clone();
  }

}