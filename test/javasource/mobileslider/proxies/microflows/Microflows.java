// This file was generated by Mendix Business Modeler 5.0.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mobileslider.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the MobileSlider module

	public static usermanagement.proxies.Account getCurrentAccount(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "MobileSlider.GetCurrentAccount", params);
			return result == null ? null : usermanagement.proxies.Account.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}

	public static mobileslider.proxies.MobileSliderFlow getCurrentMobileSliderFlow(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "MobileSlider.GetCurrentMobileSliderFlow", params);
			return result == null ? null : mobileslider.proxies.MobileSliderFlow.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}