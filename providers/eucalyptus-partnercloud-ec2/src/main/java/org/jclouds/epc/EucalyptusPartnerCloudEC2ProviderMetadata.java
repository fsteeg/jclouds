/**
 * Licensed to jclouds, Inc. (jclouds) under one or more
 * contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  jclouds licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jclouds.epc;

import java.net.URI;

import org.jclouds.eucalyptus.EucalyptusApiMetadata;
import org.jclouds.providers.BaseProviderMetadata;

/**
 * Implementation of {@ link org.jclouds.types.ProviderMetadata} for Eucalpytus'
 * Partner Cloud EC2 provider.
 * 
 * @author Jeremy Whitlock <jwhitlock@apache.org>
 */
public class EucalyptusPartnerCloudEC2ProviderMetadata extends BaseProviderMetadata {

   public EucalyptusPartnerCloudEC2ProviderMetadata() {
      this(builder()
            .id("eucalyptus-partnercloud-ec2")
            .name("Eucalyptus Partner Cloud (EC2)")
            .api(new EucalyptusApiMetadata())
            .homepage(URI.create("http://www.eucalyptus.com/partners"))
            .console(URI.create("https://partnercloud.eucalyptus.com:8443"))
            .linkedServices("eucalyptus-partnercloud-ec2", "eucalyptus-partnercloud-s3")
            .iso3166Codes("US-CA"));
   }

   // below are so that we can reuse builders, toString, hashCode, etc.
   // we have to set concrete classes here, as our base class cannot be
   // concrete due to serviceLoader
   protected EucalyptusPartnerCloudEC2ProviderMetadata(ConcreteBuilder builder) {
      super(builder);
   }

   private static class ConcreteBuilder extends Builder<ConcreteBuilder> {

      @Override
      public EucalyptusPartnerCloudEC2ProviderMetadata build() {
         return new EucalyptusPartnerCloudEC2ProviderMetadata(this);
      }
   }

   public static ConcreteBuilder builder() {
      return new ConcreteBuilder();
   }

   public ConcreteBuilder toBuilder() {
      return builder().fromProviderMetadata(this);
   }

}
