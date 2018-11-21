from django.shortcuts import render
from .serializer import UsersSerializer
from .models import Users
from rest_framework import generics

class UsersView(generics.ListAPIView):
    #ListAPIView provides GET method handlers
    queryset=Users.objects.all()
    serializer_class = UsersSerializer
