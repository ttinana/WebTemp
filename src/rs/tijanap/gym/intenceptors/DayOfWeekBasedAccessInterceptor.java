package rs.tijanap.gym.intenceptors;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 23 cas - Interceptor https://www.youtube.com/watch?v=sLC3CO4LWz0
 * 
 * This app should work on all week days except on sunday
 * 
 */

public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter {

	/**
	 * description if this method returns true then - app will handle the
	 * request if this method returns false then - app will NOT handle the
	 * request
	 */
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {

		Calendar cal = Calendar.getInstance();

		int dayOfWeek = cal.get(cal.DAY_OF_WEEK); // getting the day on which
													// request is made

		if (dayOfWeek == 1) { // 1 means Sunday, 2 means Monday....7 means
								// Saturday

			response.getWriter().write(
					"The Website is closed on Sunday; please try accessing it "
							+ "on any other week day!!");

			return false;
		}

		return true;

	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		// this method would be called after Spring MVC executes the request
		// handler method for the request
		System.out
				.println("HandlerInterceptorAdapter : Spring MVC called postHandle method for "
						+ request.getRequestURI().toString());

	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

		// this method would be called after the response object is produced by
		// the view for the request
		System.out
				.println("HandlerInterceptorAdapter : Spring MVC called afterCompletion method for "
						+ request.getRequestURI().toString());

	}

}
