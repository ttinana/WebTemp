package rs.tijanap.gym.servlets.dispatcherservlet;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

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

		int dayOfWeek = cal.get(cal.DAY_OF_WEEK); 
													

		if (dayOfWeek == 1) { // 1 means Sunday, 2 means Monday...
			response.getWriter().write(
					"Sajt CRHoV-a je zatvoren nedeljom. "
							+ "Hvala na razumevanju.");
			return false;
		}

		return true;

	}

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		System.out
				.println(" PostHandle method for "
						+ request.getRequestURI().toString());

	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

		System.out
				.println("AfterCompletion method for "
						+ request.getRequestURI().toString());

	}

}

