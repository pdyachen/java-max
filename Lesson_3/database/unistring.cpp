/** 
 *   HTTP Server
 *
 *   Copyright (C) 2016  Maxim Alov
 *
 *   This program is free software; you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation; either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program; if not, write to the Free Software Foundation,
 *   Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301  USA
 *
 *   This program and text files composing it, and/or compiled binary files
 *   (object files, shared objects, binary executables) obtained from text
 *   files of this program using compiler, as well as other files (text, images, etc.)
 *   composing this program as a software project, or any part of it,
 *   cannot be used by 3rd-parties in any commercial way (selling for money or for free,
 *   advertising, commercial distribution, promotion, marketing, publishing in media, etc.).
 *   Only the original author - Maxim Alov - has right to do any of the above actions.
 */

#include "unistring.h"

namespace db {

/*WrappedString::WrappedString(const String_t& str)  // private
  : m_string(str) {
}*/

WrappedString::WrappedString(const std::string& ordinary_str)
  : m_string(ordinary_str.begin(), ordinary_str.end()) {
}

WrappedString::WrappedString() {
}

WrappedString::WrappedString(const void* raw_char_data)
  : m_string(static_cast<const Char_t*>(raw_char_data)) {
}

WrappedString::~WrappedString() {
}


size_t WrappedString::length() const {
  return (this->m_string.length());
}

int WrappedString::n_bytes() const {
  return (static_cast<int>(this->m_string.length()) * sizeof(Char_t) * 2);
}

const WrappedString::Char_t* WrappedString::c_str() const {
  return (this->m_string.c_str());
}

const WrappedString::String_t& WrappedString::get() const {
  return (this->m_string);
}

WrappedString& WrappedString::operator += (const WrappedString& rhs) {
  this->m_string += rhs.m_string;
  return (*this);
}

/* To string */
// ----------------------------------------------
WrappedString WrappedString::to_string (int val) {
  return (WrappedString(__TO_STRING__(val)));
}

WrappedString WrappedString::to_string (long val) {
  return (WrappedString(__TO_STRING__(val)));
}

WrappedString WrappedString::to_string (long long val) {
  return (WrappedString(__TO_STRING__(val)));
}

WrappedString WrappedString::to_string (unsigned val) {
  return (WrappedString(__TO_STRING__(val)));
}

WrappedString WrappedString::to_string (unsigned long val) {
  return (WrappedString(__TO_STRING__(val)));
}

WrappedString WrappedString::to_string (unsigned long long val) {
  return (WrappedString(__TO_STRING__(val)));
}

WrappedString WrappedString::to_string (float val) {
  return (WrappedString(__TO_STRING__(val)));
}

WrappedString WrappedString::to_string (double val) {
  return (WrappedString(__TO_STRING__(val)));
}

WrappedString WrappedString::to_string (long double val) {
  return (WrappedString(__TO_STRING__(val)));
}

/* WrappedString exception */
// ----------------------------------------------------------------------------
WrappedStringException::WrappedStringException(const char* i_message)
  : m_message(i_message) {
}

WrappedStringException::~WrappedStringException() throw() {
}

const char* WrappedStringException::what() const throw() {
  return (this->m_message);
}

}  // namespace db

