from django.conf.urls import url, include
from rest_framework.urlpatterns import format_suffix_patterns
from .views import UsersView

urlpatterns = {
    url(r'^users/$', UsersView.as_view(), name="create"),
}

urlpatterns = format_suffix_patterns(urlpatterns)
