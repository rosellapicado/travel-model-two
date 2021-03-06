/*
 * JPPF.
 * Copyright (C) 2005-2010 JPPF Team.
 * http://www.jppf.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jppf.server.scheduler.bundle.providers;

import org.jppf.server.scheduler.bundle.*;
import org.jppf.server.scheduler.bundle.impl.ProportionalBundler;
import org.jppf.server.scheduler.bundle.proportional.ProportionalTuneProfile;
import org.jppf.server.scheduler.bundle.spi.JPPFBundlerProvider;
import org.jppf.utils.TypedProperties;

/**
 * Provider implementation for the "proportional" load-balancing algorithm.
 * @author Laurent Cohen
 */
public class ProportionalBundlerProvider implements JPPFBundlerProvider
{

	/**
	 * Create a bundler instance using the specified parameters profile.
	 * @param profile - an <code>AutoTuneProfile</code> instance.
	 * @return an instance of the bundler implementation defined by this provider.
	 * @see org.jppf.server.scheduler.bundle.spi.JPPFBundlerProvider#createBundler(org.jppf.server.scheduler.bundle.LoadBalancingProfile)
	 */
	public Bundler createBundler(LoadBalancingProfile profile)
	{
		return new ProportionalBundler(profile);
	}

	/**
	 * Create a bundler profile containing the parameters of the algorithm.
	 * @param configuration - a set of properties defining the algorithm's parameters.
	 * @return an {@link org.jppf.server.scheduler.bundle.proportional.ProportionalTuneProfile ProportionalTuneProfile} instance.
	 * @see org.jppf.server.scheduler.bundle.spi.JPPFBundlerProvider#createProfile(org.jppf.utils.TypedProperties)
	 */
	public LoadBalancingProfile createProfile(TypedProperties configuration)
	{
		return new ProportionalTuneProfile(configuration);
	}

	/**
	 * Get the name of the algorithm defined by this provider.
	 * @return the algorithm's name as a string.
	 * @see org.jppf.server.scheduler.bundle.spi.JPPFBundlerProvider#getAlgorithmName()
	 */
	public String getAlgorithmName()
	{
		return "proportional";
	}

}
